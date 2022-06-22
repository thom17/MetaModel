package codeGenerater;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import SWVS.Field;
import SWVS.Flow;
import SWVS.MClass;
import SWVS.MMethod;
import SWVS.MObject;
import SWVS.MSystem;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.UseCase;

public class PythonCodeGenerater {
  String codePath = "autoGen/python/";
  Project project;
  EList<MClass> classList;
  File filePath;

  public PythonCodeGenerater(Project project) {
    this.project = project;
    classList = project.getClassList();

  }

  private void makeTimePath() {
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm");// mm-ss
    String time = format.format(date);
    String src = codePath + time;
    File folder = new File(src);
    folder.mkdir();
    src += "/src";
    folder = new File(src);
    folder.mkdir();
    codePath = src;
  }

  protected void makeFile(String code) throws IOException {
    FileWriter fw = new FileWriter(filePath, false);
    fw.write(code);
    fw.close();
  }

  public void make() {
    makeTimePath();
    for (MClass cls : classList) {
      filePathSet(cls);
      String code = makeCode(cls);
      try {
        makeFile(code);
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }


    }
  }

  private String makeCode(MClass cls) {
    StringBuilder sb = new StringBuilder();
    makeImportDef(cls, sb);
    sb.append("\n");
    makeMClassDef(cls, sb);
    sb.append("\n");
    return sb.toString();
  }

  private void makeMMethod(MClass cls, StringBuilder sb) {
    for (MMethod method : cls.getMethods()) {
      if (method.getTestUsecase() == null)
        for (MObject flow : method.getBase()) {
          makeMMethodBlock((Flow) flow, method, sb);
          sb.append("\n");
        }
      else {
        makeMMethodBlock(method, sb);
        sb.append("\n");
      }
    }

  }

  // Use case MMethod Blcok
  private void makeMMethodBlock(MMethod method, StringBuilder sb) {
    String tab = "\t";
    String intab = "\t\t";
    String sig = method.getObjectName();
    sig = sig.replace("(", "(self, ");
    sb.append(tab + "def " + sig + ":\n");
    String comment = makeMMethodComment(method.getTestUsecase(), intab);
    sb.append(comment);
    callExp((EList<MObject>) method.getBase(), sb, intab);

    sb.append("\n");

    // TODO Auto-generated method stub

  }// 위랑 통일해야됨 사실상

  private void makeMMethodBlock(Flow flow, MMethod method, StringBuilder sb) {
    String tab = "\t";
    String intab = "\t\t";

    String sig = method.getObjectName();
    sig = sig.replace("(", "(self, ");

    sb.append(tab + "def " + sig + ":\n");
    String comment = makeMMethodComment(flow, intab);
    sb.append(comment);


    callExpByFlows(flow.getDetailFlows(), sb, intab);
    sb.append("\n");


  }

  private void callExpByFlows(EList<Flow> flowList, StringBuilder sb, String tab) {
    for (Flow callMMethod : flowList) {
      // 컬 내부 정보 정리?
      MObject host = getHost(callMMethod.getHost());
      String hostName = "";
      if (host != null) {
        if (host.getObjectName() != null)
          hostName = host.getObjectName() + ".";
        else
          hostName = host.getId() + ".";
      }
      String callLine = hostName + callMMethod.getObjectName();
      sb.append(tab + "#" + callMMethod.getContext() + tab + callMMethod.getId() + "\n");
      sb.append(tab + callLine + "\n");
    }

  }

  private String makeMMethodComment(UseCase uc, String tab) {
    StringBuilder sb = new StringBuilder(tab + "\"\"\"" + uc.getId() + "\n");
    sb.append(tab + uc.getContext() + "\n");
    sb.append(tab + "\"\"\"\n");
    return sb.toString();
  }

  private String makeMMethodComment(Flow flow, String tab) {
    StringBuilder sb = new StringBuilder(tab + "\"\"\" " + flow.getId() + "\n");
    sb.append(tab + flow.getContext() + "\n\n");
    sb.append(tab + "return " + flow.getResult() + "\n");
    sb.append(tab + "\"\"\"\n");
    return sb.toString();
  }

  private MObject getHost(EList<MObject> eList) {
    for (MObject ob : eList) {
      if (ob instanceof MClass || ob instanceof MSystem)
        return ob;
    }
    return null;
  }

  private void callExp(EList<MObject> flowList, StringBuilder sb, String tab) {
    for (MObject callobj : flowList) {
      Flow callMMethod = (Flow) callobj;
      // 컬 내부 정보 정리?
      MObject host = getHost(callMMethod.getHost());
      String hostName = "";
      if (host != null) {
        if (host.getObjectName() != null)
          hostName = host.getObjectName() + ".";
        else
          hostName = host.getId() + ".";
      }
      String callLine = hostName + callMMethod.getObjectName();
      sb.append(tab + "#" + callMMethod.getContext() + tab + callMMethod.getId() + "\n");
      sb.append(tab + callLine + "\n");
    }
  }



  private void makeImportDef(MClass cls, StringBuilder sb) {
    for (MClass has : cls.getHasClassList()) {
      String packageName = has.getPackage();
      String name = has.getObjectName();
      String importStr = "from " + packageName + " import " + name;
      sb.append(importStr + "\n");
    }

  }

  private void makeMClassComment(MClass cls, StringBuilder sb) {
    sb.append("\t\"\"\"\n");
    for (MObject base : cls.getDefBase()) {
      if (base instanceof MSystem) {
        MSystem baseSys = (MSystem) base;
        for (UseCase uc : baseSys.getUsecase()) {
          for (Requirement rq : uc.getRequirements())
            sb.append("\t" + rq.getId() + ":" + rq.getContents() + "\n");
        }
      }
    }
    sb.append("\n");
    for (Field filed : cls.getFields()) {
      makeField(filed, sb, "\t");
    }

    sb.append("\t\"\"\"\n");
  }

  private void makeMClassDef(MClass cls, StringBuilder sb) {
    String tab = "\t";
    cls.setData_base_SrcName(cls.getPackage() + "." + cls.getObjectName());
    sb.append("class " + cls.getObjectName() + ": \n");
    makeMClassComment(cls, sb);

    sb.append("\n");
    makeMMethod(cls, sb);
    sb.append("\n");
  }

  private void makeField(Field filed, StringBuilder sb, String tab) {
    // 추후 초기화 및 접근자 등 관련
    sb.append(tab + "field " + filed.getObjectName() + " : " + filed.getTypeName() + "\n");
  }

  // digram.usecase.test 와 같은 패키지 폴더내 폴더 후에 처리해야함
  private void filePathSet(MClass cls) {
    String packageName = cls.getPackage();
    String className = cls.getObjectName();

    filePath = new File(codePath + "/" + packageName);

    if (!filePath.exists()) // 폴더 존재.
      filePath.mkdir();

    filePath = new File(codePath + "/" + packageName + "/" + className + ".py");

  }



}
