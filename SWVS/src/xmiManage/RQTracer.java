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
   * 설계 모델의 요구사항을 bottom Up으로 갱신하고 모두 모아 반환<br>
   * 프로젝트내부에 포함된 요구사항 모델을 모아 반환<br>
   * 프로젝트의 가장 상단의 모델 System 들의 요구사항들을 반환함<br>
   * 
   * @param project : 검색할 프로젝트 모델
   * @return : 프로젝트 설계 모델들에 반영된 요구사항을 반환.
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
   * Object 클래스들 EObject의 Container를 사용하여 업데이트.<br>
   * 재귀구조이며 System일시 종료.<br>
   * 즉 Bottom Up은 System 까지.
   * 
   * @param obj: System이 아니라면 상단의 Rq 업데이트 함.
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
