package diagram;

import java.io.IOException;
import SWVS.Field;
import SWVS.MClass;
import SWVS.MMethod;
import SWVS.MObject;
import SWVS.Project;

public class ClassDg extends Base {
  Project project;

  public ClassDg(Project project) {
    this.project = project;
    this.fileName = project.getProjectName() + "_MClassDiagram";
    this.sb = new StringBuilder();
    this.path = "model";
  }

  @Override
  protected void draw() {
    sb.append("@startuml\n");
    for (MClass cls : project.getClassList()) {
      drawMClass(cls);
    }
    sb.append("@enduml\n");
  }

  public static ClassDg main(Project project) throws IOException {
    ClassDg dg = new ClassDg(project);
    dg.draw();
    dg.make();
    return dg;
  }

  private void drawMClass(MClass cls) {
    String className = cls.getObjectName();
    String color = " ";
    if (cls.isAddedObject())
      color += "#pink";
    sb.append("class " + className + color + "\n{\n");
    for (Field filed : cls.getFields()) {
      drawFiled(filed);
    }
    sb.append("\n");
    for (MMethod fun : cls.getMethods()) {
      drawMethod(fun);
    }
    sb.append("\n}\n");
    for (MClass has : cls.getHasClassList()) {
      sb.append(" " + className + " *-- " + has.getObjectName() + "\n");
    }
    sb.append("\n");
  }

  private void drawMethod(MObject object) {
    String color = "";
    if (object.isAddedObject())
      color += "<color:red>";
    String info = color + object.getObjectName();
    sb.append("\t" + info + "\n");
  }

  private void drawFiled(Field filed) {
    String color = " ";
    if (filed.isAddedObject())
      color += "<color:red>";
    String info = color + filed.getTypeName() + " " + filed.getObjectName();
    if (!filed.isIsClass())
      sb.append("\t" + info + "\n");
  }


}
