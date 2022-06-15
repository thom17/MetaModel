package xmiManage;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import SWVS.Flow;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.System;
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
    for (System sys : project.getSystem()) {
      traceSystem(sys, rqList);
    }
    return rqList;
  }

  private static void traceFlow(Flow flow) {
    EList<Flow> detaileFlows = flow.getDetailFlow();
    if (0 < detaileFlows.size()) {
      for (Flow fl : detaileFlows)
        traceFlow(fl);
    } else {
      updateRqTop(flow);
    }

  }

  private static void traceSystem(System sys, ArrayList<Requirement> rqList) {
    // TODO Auto-generated method stub
    for (UseCase uc : sys.getUsecase()) {
      for (Flow flow : uc.getFlow()) {
        traceFlow(flow);
      }
    }
    for (Requirement rq : sys.getRequirement()) {
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
  private static void updateRqTop(SWVS.Object obj) {
    if (obj instanceof SWVS.System)
      return;
    SWVS.Object container = (SWVS.Object) obj.eContainer();

    // java.lang.System.out.println(container.getId());
    EList<Requirement> rqList = container.getRequirement();
    for (Requirement rq : obj.getRequirement()) {
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
