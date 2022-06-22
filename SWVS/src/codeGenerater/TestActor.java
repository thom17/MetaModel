package codeGenerater;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import SWVS.Actor;
import SWVS.Flow;
import SWVS.MClass;
import SWVS.MSystem;
import SWVS.Project;

public class TestActor {
  String codePath = "autoGen/src";
  String packageName = "actorTestCode";
  String className;
  Project project;
  EList<MClass> classList;
  EList<Actor> actorList;
  File filePath;

  public static void main(String args[]) {

  }

  public TestActor(Project project) {
    this.project = project;
    classList = project.getClassList();
    actorList = project.getActorList();
  }

  protected void makeFile(String code) throws IOException {
    FileWriter fw = new FileWriter(filePath, false);
    fw.write(code);
    fw.close();
  }

  public void make() {
    for (Actor actor : actorList) {
      filePathSet(actor);
      String code = makeCode(actor);
      try {
        makeFile(code);
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  public void makeInitFile() throws IOException {
    System.out.println("target_projcet.info making...\n");
    File file = new File("target_project.info");
    String src = file.getAbsolutePath().replace("\\target_project.info", "");
    String str = codePath;
    System.out.println(src + "/target_projcet.info make finish\n");
    // System.out.println(str);

    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    writer.write(str);
    writer.close();
  }

  private String makeCode(Actor actor) {
    StringBuilder sb = new StringBuilder("package " + packageName + ";\n");
    ArrayList<SWVS.MClass> classList = new ArrayList<SWVS.MClass>();
    EList<SWVS.UseCase> usecaseList = actor.getActUsecases();
    for (SWVS.UseCase uc : usecaseList) {
      MSystem system = (MSystem) uc.eContainer();
      SWVS.MClass cls = system.getDefClass().get(0);
      if (cls != null && !classList.contains(cls))
        classList.add(cls);
    }

    makeImportDef(classList, sb);

    makeMClassDef(actor, sb);

    return sb.toString();
    /*
     * StringBuilder sb = new StringBuilder("package "+actor.getPackage()+";\n"); sb.append("\n");
     * makeImportDef(actor, sb); sb.append("\n"); makeMClassDef(actor, sb); sb.append("\n"); return
     * sb.toString();
     */

  }

  private void makeMethod(SWVS.UseCase usecase, StringBuilder sb) {
    String ucId = usecase.getId();
    MSystem system = (MSystem) usecase.eContainer();
    SWVS.MClass cls = system.getDefClass().get(0);
    String line = "";
    if (cls != null) {
      line = cls.getObjectName() + ".";
    }
    EList<Flow> flowList = usecase.getFlows();
    if (flowList.size() == 0) {
      line += "not_define_Flow()";
    } else
      line += flowList.get(0).getObjectName();

    makeMethodComment(usecase, sb);
    sb.append("\tpublic static void test_" + ucId + "(){\n");
    sb.append("\t\t" + line + ";\n");
    sb.append("\t}\n");

  }

  private String makeMethodComment(SWVS.UseCase usecase, StringBuilder sb) {
    String tab = "\t";
    sb.append(tab + "/**" + usecase.getId() + "\n");
    sb.append(tab + usecase.getContext() + "\n");
    sb.append(tab + "*/\n");
    return sb.toString();
  }

  /*
   * private void makeMethodBlock(Flow method, StringBuilder sb) { String tab = "\t"; String intab =
   * "\t\t"; String comment = makeMethodComment(method, "\t"); sb.append(comment);
   * sb.append(tab+"public void "+method.getObjectName()+"\n\t{\n");
   * 
   * for(Flow callMethod : method.getDetailFlow() ) { //�� ���� ���� ����?
   * 
   * Object host = callMethod.getHost().get(0); String callLine =
   * host.getObjectName()+"."+callMethod.getObjectName()+";\n";
   * sb.append(intab+"//"+callMethod.getContext()+"\n"); sb.append(intab+callLine+"\n"); }
   * 
   * sb.append(tab+"}\n"); }
   */
  // import SWVS.Actor;
  private void makeImportDef(ArrayList<SWVS.MClass> classList, StringBuilder sb) {
    for (SWVS.MClass cls : classList) {
      sb.append("import " + cls.getPackage() + "." + cls.getObjectName() + ";\n");
    }
    sb.append("\n");

  }

  private void makeMClassDef(SWVS.Actor actor, StringBuilder sb) {
    sb.append("public class " + className + "\n{\n");
    for (SWVS.UseCase usecase : actor.getActUsecases()) {
      makeMethod(usecase, sb);
    }
    sb.append("\n");
    sb.append("}\n");
  }


  // digram.usecase.test �� ���� ��Ű�� ������ ���� �Ŀ� ó���ؾ���
  private String filePathSet(Actor actor) {
    className = "t_" + actor.getObjectName();
    filePath = new File(codePath + "/" + packageName);

    if (!filePath.exists()) // ���� ����.
      filePath.mkdir();

    filePath = new File(codePath + "/" + packageName + "/" + className + ".java");
    return className;

  }



}
