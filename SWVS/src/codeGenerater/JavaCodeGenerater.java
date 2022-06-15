package codeGenerater;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import SWVS.Class;
import SWVS.Field;
import SWVS.Flow;
import SWVS.Method;
import SWVS.Object;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.UseCase;

public class JavaCodeGenerater {
  String codePath = "autoGen/java/";
  Project project;
  EList<Class> classList;
  File filePath;

  public JavaCodeGenerater(Project project) {
    this.project = project;
    classList = project.getClass_();

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
    for (Class cls : classList) {
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

  private String makeCode(Class cls) {
    cls.getPackage();
    StringBuilder sb = new StringBuilder("package " + cls.getPackage() + ";\n");
    sb.append("\n");
    makeImportDef(cls, sb);
    sb.append("\n");
    makeClassDef(cls, sb);
    sb.append("\n");
    return sb.toString();
  }

  private void makeMethod(Class cls, StringBuilder sb) {
    for (Method method : cls.getMethod()) {
      if (method.getUsecase() == null)
        for (Object flow : method.getBase()) {
          makeMethodBlock((Flow) flow, method, sb);
          sb.append("\n");
        }
      else {
        makeMethodBlock(method, sb);
        sb.append("\n");
      }
    }

  }

  // Use case Method Blcok
  private void makeMethodBlock(Method method, StringBuilder sb) {
    String tab = "\t";
    String intab = "\t\t";
    String type = "public ";
    if (method.isIsStatic())
      type += "static ";
    type += method.getReturnType() + " ";
    String comment = makeMethodComment(method.getUsecase(), "\t");
    sb.append(comment);
    sb.append(tab + type + method.getObjectName() + "\n\t{\n");


    callExp(method.getBase(), sb, intab);

    sb.append(tab + "}\n");

    // TODO Auto-generated method stub

  }// 위랑 통일해야됨 사실상

  private void makeMethodBlock(Flow flow, Method method, StringBuilder sb) {
    String tab = "\t";
    String intab = "\t\t";
    String comment = makeMethodComment(flow, "\t");
    sb.append(comment);
    sb.append(tab + "public void " + method.getObjectName() + "\n\t{\n");
    callExpByFlows(flow.getDetailFlow(), sb, intab);
    sb.append(tab + "}\n");

    // TODO Auto-generated method stub

  }

  private void callExpByFlows(EList<Flow> detailFlow, StringBuilder sb, String tab) {
    for (Flow callMethod : detailFlow) {
      // 컬 내부 정보 정리?
      Object host = getHost(callMethod.getHost());
      String hostName = "";
      if (host != null) {
        if (host.getObjectName() != null)
          hostName = host.getObjectName() + ".";
        else
          hostName = host.getId() + ".";
      }
      String callLine = hostName + callMethod.getObjectName() + ";\n";
      sb.append(tab + "//" + callMethod.getContext() + tab + callMethod.getId() + "\n");
      sb.append(tab + callLine + "\n");
    }
  }

  private String makeMethodComment(UseCase uc, String tab) {
    StringBuilder sb = new StringBuilder(tab + "/**" + uc.getId() + "\n");
    sb.append(tab + uc.getContext() + "\n");
    sb.append(tab + "*/\n");
    return sb.toString();
  }

  private String makeMethodComment(Flow flow, String tab) {
    StringBuilder sb = new StringBuilder(tab + "/**" + flow.getId() + "\n");
    sb.append(tab + flow.getContext() + "\n");

    if (flow.getResult() != null && 0 < flow.getResult().length())
      sb.append(tab + "@return " + flow.getResult() + "\n");

    sb.append(tab + "*/\n");
    return sb.toString();
  }

  private Object getHost(EList<Object> eList) {
    for (Object ob : eList) {
      if (ob instanceof Class || ob instanceof SWVS.System)
        return ob;
    }
    return null;
  }

  private void callExp(EList<Object> objList, StringBuilder sb, String tab) {
    for (Object obj : objList) {
      // 컬 내부 정보 정리?
      Flow callMethod = (Flow) obj;
      Object host = getHost(callMethod.getHost());
      String hostName = "";
      if (host != null) {
        if (host.getObjectName() != null)
          hostName = host.getObjectName() + ".";
        else
          hostName = host.getId() + ".";
      }
      String callLine = hostName + callMethod.getObjectName() + ";\n";
      sb.append(tab + "//" + callMethod.getContext() + tab + callMethod.getId() + "\n");
      sb.append(tab + callLine + "\n");
    }
  }



  private void makeImportDef(Class cls, StringBuilder sb) {
    for (Class has : cls.getHasClass()) {
      String packageName = has.getPackage();
      String name = has.getObjectName();
      String importStr = "import " + packageName + "." + name + ";";
      sb.append(importStr + "\n");
    }

  }

  /**
   * 기반이 되는 모델 정보의 요구사항 출력.<br>
   * 
   * @param cls 타겟 클래스
   * @param sb 작성중인 코드
   */
  private void makeClassComment(Class cls, StringBuilder sb) {
    sb.append("\t/**");
    for (Object base : cls.getDefBase()) {
      if (base instanceof SWVS.System) {
        SWVS.System baseSys = (SWVS.System) base;
        for (UseCase uc : baseSys.getUsecase()) {
          for (Requirement rq : uc.getRequirement())
            sb.append("\t" + rq.getId() + ":" + rq.getContents() + "\n");
        }
      }
    }
    sb.append("\t*/\n");
  }

  private void makeClassDef(Class cls, StringBuilder sb) {
    String tab = "\t";
    cls.setData_base_SrcName(cls.getPackage() + "." + cls.getObjectName());
    makeClassComment(cls, sb);
    sb.append("public class " + cls.getObjectName() + "\n{\n");
    for (Field filed : cls.getField()) {
      makeField(filed, sb, tab);
    }
    sb.append("\n");
    makeMethod(cls, sb);
    sb.append("}\n");
  }

  private void makeField(Field filed, StringBuilder sb, String tab) {
    // 추후 초기화 및 접근자 등 관련
    sb.append(tab + filed.getTypeName() + " " + filed.getObjectName() + ";\n");
  }

  // digram.usecase.test 와 같은 패키지 폴더내 폴더 후에 처리해야함
  private void filePathSet(Class cls) {
    String packageName = cls.getPackage();
    String className = cls.getObjectName();

    filePath = new File(codePath + "/" + packageName);

    if (!filePath.exists()) // 폴더 존재.
      filePath.mkdir();

    filePath = new File(codePath + "/" + packageName + "/" + className + ".java");

  }



}
