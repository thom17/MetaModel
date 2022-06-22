package diagram;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import SWVS.Actor;
import SWVS.Flow;
import SWVS.MObject;
import SWVS.MSystem;
import SWVS.Project;
import SWVS.UseCase;

public class SequenceDgOrg extends Base {
  MSystem system;
  Actor actor;

  public SequenceDgOrg(MSystem system) {
    this.system = system;
    this.fileName = system.getObjectName();
    this.sb = new StringBuilder();
    this.path = "model";
  }

  public SequenceDgOrg(Actor actor) {
    this.actor = actor;
    this.fileName = actor.getObjectName() + "_Seq";
    this.sb = new StringBuilder();
    this.path = "model";
  }

  public static SequenceDgOrg[] main(Project project) throws IOException {
    EList<Actor> actorList = project.getActorList();
    SequenceDgOrg list[] = new SequenceDgOrg[actorList.size()];
    for (int i = 0; i < actorList.size(); i++) {
      list[i] = new SequenceDgOrg(actorList.get(i));
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
    String clientName = client.getObjectName();
    if (client instanceof Actor)
      clientName = ((Actor) client).getObjectName();

    EList<Flow> detaileflowList = flow.getDetailFlows();

    if (0 < detaileflowList.size()) // 상세 flow 있다면 그룹 생성
    {
      sb.append(tab + "group " + flow.getObjectName() + "\n");
      for (Flow detailFlow : detaileflowList) {
        end = drawFlow(detailFlow, tab + "\t");
      }
      MObject endHost = findActor(end.getHost());
      sb.append(tab + endHost.getObjectName() + "-->" + host.getObjectName() + " : "
          + flow.getResult() + "\n");
      sb.append(tab + "end\n");
    } else // 없다면 단순 생성
      sb.append(
          tab + clientName + "->" + host.getObjectName() + " : " + flow.getObjectName() + "\n");

    return flow;
  }

  private MObject findActor(EList<MObject> list) {
    for (MObject ob : list)
      if (ob instanceof Flow)
        continue;
      else
        return ob;
    return null;
  }
}
