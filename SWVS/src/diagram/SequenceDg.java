package diagram;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import SWVS.Actor;
import SWVS.Flow;
import SWVS.MObject;
import SWVS.MSystem;
import SWVS.Project;
import SWVS.UseCase;
import xmiManage.ModelManager;

public class SequenceDg extends Base {
  MSystem system;
  Actor actor;

  public SequenceDg(MSystem system) {
    this.system = system;
    this.fileName = system.getObjectName();
    this.sb = new StringBuilder();
    this.path = "model";
  }

  public SequenceDg(Actor actor) {
    this.actor = actor;
    this.fileName = actor.getObjectName() + "_Seq";
    this.sb = new StringBuilder();
    this.path = "model";
  }

  public static SequenceDg[] main(Project project) throws IOException {
    EList<Actor> actorList = project.getActorList();
    SequenceDg list[] = new SequenceDg[actorList.size()];
    for (int i = 0; i < actorList.size(); i++) {
      list[i] = new SequenceDg(actorList.get(i));
      list[i].draw();
      list[i].make();
    }
    return list;
  }

  @Override
  protected void draw() {
    sb.append("@startuml\n");
    for (UseCase usecase : actor.getActUsecases()) {
      sb.append("group " + usecase.getId() + " " + usecase.getObjectName() + "\n");
      drawUsecase(usecase);
      sb.append("end\n");
    }
    sb.append("@enduml\n");

  }

  private void drawUsecase(UseCase usecase) {
    String tab = "\t";
    for (Flow flow : usecase.getFlows()) {
      // sb.append("group "+usecase.getId()+" "+usecase.getUsecaseName()+"\n");
      drawFlow(flow, tab);
      // sb.append("end\n");
    }
  }

  private Flow drawFlow(Flow flow, String tab) {
    MObject client = findActor(flow.getClients());
    MObject host = findActor(flow.getHost());
    Flow end = flow;
    if (client == null && host != null)
      client = host;
    else if (client != null && host == null)
      host = client;
    else if (client == null && host == null)
      return flow;
    String clientName = client.getObjectName();

    if (client instanceof Actor)
      clientName = ((Actor) client).getObjectName();

    EList<Flow> detaileflowList = flow.getDetailFlows();

    if (0 < detaileflowList.size()) // ???? flow ?????? ???? ????
    {
      sb.append(tab + "group " + flow.getObjectName() + "\n");
      for (Flow detailFlow : detaileflowList) {
        end = drawFlow(detailFlow, tab + "\t");
      }
      MObject endHost = findActor(end.getHost());
      if (endHost != null) {
        sb.append(tab + endHost.getObjectName() + "-->" + host.getObjectName() + " : "
            + flow.getResult() + "\n");
        sb.append(tab + "end\n");
      }
    } else // ?????? ???? ????
      sb.append(
          tab + clientName + "->" + host.getObjectName() + " : " + flow.getObjectName() + "\n");

    return flow;
  }

  private MObject findActor(EList<MObject> list) {
    for (MObject ob : list)
      if (ob instanceof Flow)
        continue;
      else if (ob instanceof MSystem || ob instanceof Actor || ob instanceof SWVS.MObject)
        return ob;
    return null;
  }

  public static void main(String[] args) {
    ModelManager mmg = new ModelManager("test.swvs");
    EList<Actor> actorList = mmg.project.getActorList();
    SequenceDg list[] = new SequenceDg[actorList.size()];
    for (int i = 0; i < actorList.size(); i++) {
      list[i] = new SequenceDg(actorList.get(i));
      list[i].draw();
      System.out.println(list[i].sb);
    }

  }
}
