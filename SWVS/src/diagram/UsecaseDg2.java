package diagram;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import SWVS.Actor;
import SWVS.Flow;
import SWVS.Project;
import SWVS.System;
import SWVS.UseCase;
import xmiManage.XmiReader;

public class UsecaseDg2 extends Base {
  Project project;

  public UsecaseDg2(Project project) {
    this.project = project;
    this.fileName = project.getProjectName();
    this.sb = new StringBuilder();
    this.path = "model";
  }

  protected void draw() {
    sb.append("@startuml\n left to right direction\n");
    for (Actor actor : project.getActor()) {
      drwaActor(actor);
    }
    for (SWVS.System system : project.getSystem()) {
      drawSystem(system);
    }
    sb.append("@enduml");
  }

  private void drawSystem(System system) {
    sb.append("rectangle \"" + system.getObjectName() + "\" as " + system.getId() + "{\n");
    for (UseCase usecase : system.getUsecase()) {
      drawUsecase(usecase);
    }
    sb.append("}\n\n");

  }

  private double getImpUse(UseCase usecase) {
    int impNum = 0;
    int size = usecase.getFlow().size();
    for (Flow fl : usecase.getFlow()) {
      if (fl.getData_base_SrcName() == null)
        continue;
      else
        impNum++;
    }

    if (size == 0)
      return 0;
    else
      return impNum / size;

  }

  private void drawUsecase(UseCase usecase) {
    double p = getImpUse(usecase);
    int percent = (int) p * 100;
    EList<Actor> actorList = usecase.getActActors();

    if (p == 1)
      sb.append(
          "\t" + "usecase \"" + usecase.getData_base_SrcName() + "\" as " + usecase.getId() + "\n");
    else
      sb.append("\t" + "usecase \"" + usecase.getObjectName() + "(" + percent + "%)" + "\" as "
          + usecase.getId() + " #red\n");

    for (Flow fl : usecase.getFlow()) {
      if (fl.getData_base_SrcName() != null) {

        sb.append("\t\t" + "usecase \"" + fl.getData_base_SrcName() + "\" as " + fl.getId() + "\n");
        sb.append("\t\t\t" + usecase.getId() + "--" + fl.getId() + " : implement \n");
      } else {
        sb.append("\t\t" + "usecase \"" + fl.getObjectName() + "\" as " + fl.getId() + "\n");
        sb.append(
            "\t\t\t" + usecase.getId() + "--" + fl.getId() + " :<color:red> not implement \n");
      }
    }

    for (UseCase ui : usecase.getInclude()) {
      if (ui.getData_base_SrcName() != null)
        sb.append("\t" + "usecase \"" + ui.getData_base_SrcName() + "\" as " + ui.getId() + "\n");
      else
        sb.append("\t" + "usecase \"" + ui.getObjectName() + "\" as " + ui.getId() + "\n");
      sb.append("\t\t" + usecase.getId() + "-->" + ui.getId() + ": <<include>>#red\n");
    }
    for (UseCase ui : usecase.getExtend()) {
      if (ui.getData_base_SrcName() != null)
        sb.append("\t" + "usecase \"" + ui.getData_base_SrcName() + "\" as " + ui.getId() + "\n");
      else
        sb.append("\t" + "usecase \"" + ui.getObjectName() + "\" as " + ui.getId() + "\n");
      sb.append("\t\t" + usecase.getId() + "<--" + ui.getId() + ": <<extends>>#red\n");
    }
    for (Actor actor : actorList) {
      sb.append("\t\t" + actor.getId() + "--" + usecase.getId() + "\n");
    }
  }

  private void drwaActor(Actor actor) {
    if (actor.getData_base_SrcName() != null) {
      sb.append("\t actor \"" + actor.getData_base_SrcName() + "\" as " + actor.getId() + "\n");
    } else
      sb.append("\t actor \"" + actor.getObjectName() + "\" as " + actor.getId() + "#red\n");
  }

  public static void main(Project project) throws IOException {
    UsecaseDg2 dg = new UsecaseDg2(project);
    dg.draw();
    dg.make();
    dg.printSb();
  }

  public static void main(String args[]) {
    XmiReader xmi = new XmiReader("RDOM/Dice.swvs");
    try {
      main((Project) xmi.getRoot());
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
