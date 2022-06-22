package xmiManage;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import SWVS.Flow;
import SWVS.MObject;
import SWVS.MSystem;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.UseCase;

public class RQTracer {
  /**
   * ���� ���� �䱸������ bottom Up���� �����ϰ� ��� ��� ��ȯ<br>
   * ������Ʈ���ο� ���Ե� �䱸���� ���� ��� ��ȯ<br>
   * ������Ʈ�� ���� ����� �� System ���� �䱸���׵��� ��ȯ��<br>
   * 
   * @param project : �˻��� ������Ʈ ��
   * @return : ������Ʈ ���� �𵨵鿡 �ݿ��� �䱸������ ��ȯ.
   */
  public static ArrayList<Requirement> projectTrace(Project project) {
    ArrayList<Requirement> rqList = new ArrayList<Requirement>();
    for (MSystem sys : project.getSystems()) {
      traceSystem(sys, rqList);
    }
    return rqList;
  }

  private static void traceFlow(Flow flow) {
    EList<Flow> detaileFlows = flow.getDetailFlows();
    if (0 < detaileFlows.size()) {
      for (Flow fl : detaileFlows)
        traceFlow(fl);
    } else {
      updateRqTop(flow);
    }

  }

  private static void traceSystem(MSystem sys, ArrayList<Requirement> rqList) {
    // TODO Auto-generated method stub
    for (UseCase uc : sys.getUsecase()) {
      for (Flow flow : uc.getFlows()) {
        traceFlow(flow);
      }
    }
    for (Requirement rq : sys.getRequirements()) {
      if (!rqList.contains(rq)) {
        rqList.add(rq);
      }
    }
  }

  /**
   * Object Ŭ������ EObject�� Container�� ����Ͽ� ������Ʈ.<br>
   * ��ͱ����̸� System�Ͻ� ����.<br>
   * �� Bottom Up�� System ����.
   * 
   * @param obj: System�� �ƴ϶�� ����� Rq ������Ʈ ��.
   */
  private static void updateRqTop(MObject obj) {
    if (obj instanceof MSystem)
      return;
    MObject container = (MObject) obj.eContainer();

    // java.lang.System.out.println(container.getId());
    EList<Requirement> rqList = container.getRequirements();
    for (Requirement rq : obj.getRequirements()) {
      if (!rqList.contains(rq))
        rqList.add(rq);
    }
    updateRqTop(container);
  }

  public static void main(String args[]) {
    ModelManager mmg = new ModelManager("test.swvs");
    for (Requirement rq : projectTrace(mmg.project)) {
      java.lang.System.out.println(rq.getId());
    }
    mmg.save();
  }
}
