package xmiManage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import SWVS.Condition;
import SWVS.Flow;
import SWVS.SWVSFactory;
import SWVS.UseCase;
import fileLoader.EventFlow;

public class FlowManager {
  Map<String, Flow> flowMap = new LinkedHashMap<String, Flow>();
  SWVSFactory f;

  public Map<String, Flow> getFlowMap() {
    return flowMap;
  }

  UseCase usecase;

  public FlowManager(UseCase uc) {
    usecase = uc;
    f = SWVSFactory.eINSTANCE;
    for (Flow flow : getAllFlowList(usecase)) {
      flowMap.put(flow.getId(), flow);
    }
  }



  public void updateFlow(Flow flow, EventFlow data) {
    flow.setContext(data.context);
    flow.setId(data.id);
    flow.setObjectName(data.name);
    flow.setResult(data.aftCond);
    flow.setFlowId(data.number);
    Condition cond = flow.getCondition();
    if (cond == null) {
      cond = f.createCondition();
      flow.setCondition(cond);
    }
    cond.setPreCondition(data.preCond);
    cond.setPostCondition(data.aftCond);

  }

  /**
   * UseCase 모델이 가지는 모든 Flow 리스트 반환.<br>
   * 
   * @param uc : UseCase (Flow 를 찾을 대상)
   * @return ArrayList uc가 가지는 모든 Flow
   */
  public static ArrayList<Flow> getAllFlowList(UseCase uc) {
    ArrayList<Flow> flowList = new ArrayList<Flow>();
    flowSearch(flowList, uc.getFlow());
    return flowList;
  }

  private static void flowSearch(ArrayList<Flow> flowList, EList<Flow> flows) {
    if (flows == null)
      return;

    for (Flow flow : flows) {
      flowList.add(flow);
      flowSearch(flowList, flow.getDetailFlow());
    }

  }

  public static void main(String args[]) {
    ArrayList<String> li = new ArrayList<String>();
    for (String st : li) {
      System.out.println(st);
    }
    System.out.println(li);

  }
}
