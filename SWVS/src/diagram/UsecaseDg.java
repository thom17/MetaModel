package diagram;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import SWVS.Actor;
import SWVS.MSystem;
import SWVS.Project;
import SWVS.UseCase;
import xmiManage.ModelManager;

public class UsecaseDg extends Base {
  Project project;

  public UsecaseDg(Project project) {
    this.project = project;
    this.fileName = project.getProjectName();
    this.sb = new StringBuilder();
    this.path = "model";
    draw();

  }

  protected void draw() {
    sb.append("@startuml\n left to right direction\n");
    for (Actor actor : project.getActorList()) {
      drwaActor(actor);
    }
    for (SWVS.MSystem system : project.getSystems()) {
      drawSystem(system);
    }
    sb.append("@enduml");
  }

  private void drawSystem(MSystem system) {
    sb.append("rectangle \"" + system.getObjectName() + "\" as " + system.getId() + "{\n");
    for (UseCase usecase : system.getUsecase()) {
      drawUsecase(usecase);
    }
    sb.append("}\n\n");

  }

  private void drawUsecase(UseCase usecase) {
    EList<Actor> actorList = usecase.getActActors();
    sb.append("\t" + "usecase \"" + usecase.getObjectName() + "\" as " + usecase.getId() + "\n");

    for (UseCase ui : usecase.getInclude()) {
      sb.append("\t" + "usecase \"" + ui.getObjectName() + "\" as " + ui.getId() + "\n");
      sb.append("\t\t" + usecase.getId() + "-->" + ui.getId() + ": <<include>>\n");
    }
    for (UseCase ui : usecase.getExtend()) {
      sb.append("\t" + "usecase \"" + ui.getObjectName() + "\" as " + ui.getId() + "\n");
      sb.append("\t\t" + usecase.getId() + "<--" + ui.getId() + ": <<extends>>\n");
    }
    for (Actor actor : actorList) {
      sb.append("\t\t" + actor.getId() + "--" + usecase.getId() + "\n");
    }
  }

  private void drwaActor(Actor actor) {
    sb.append("\t actor \"" + actor.getObjectName() + "\" as " + actor.getId() + "\n");
  }

  public static void main(String test[]) {
    ModelManager mmg = new ModelManager("test.swvs");
    UsecaseDg dg = new UsecaseDg(mmg.project);
    dg.draw();
    // dg.make();
    dg.printSb();
  }

  public static void main(Project project) throws IOException {
    UsecaseDg dg = new UsecaseDg(project);
    dg.draw();
    // dg.make();
    dg.printSb();
  }

}
