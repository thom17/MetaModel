package xmiManage;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import SWVS.Actor;
import SWVS.Condition;
import SWVS.Flow;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.SWVSFactory;
import SWVS.System;
import SWVS.UseCase;
import SWVS.impl.SWVSPackageImpl;
import fileLoader.EventFlow;
import fileLoader.UcSpecific;

public class UsecaseManager {
  SWVS.System baseSys;
  ModelManager mmg;
  Project project;
  SWVSFactory f;
  FlowManager flowManager;

  // UcSpecific ucs;

  /**
   * 맴버 설정 변경은 안함.<br>
   * 
   * @param mmg
   */
  public UsecaseManager(ModelManager mmg) {
    this.mmg = mmg;
    f = SWVSFactory.eINSTANCE;
    SWVSPackageImpl.init();
    project = mmg.project;
  }

  private void addActor(UseCase uc, UcSpecific ucs) {
    EList<Actor> actorList = uc.getActActors();
    String useActorList[] = ucs.getUseActor();
    if (useActorList != null) {
      for (int i = 0; i < useActorList.length; i++) {
        for (Actor actor : project.getActor()) {
          if (actor.getId().equals(useActorList[i])
              || actor.getObjectName().equals(useActorList[i])) {
            actorList.add(actor);
            break;
          }
        }
        if (actorList.size() == i) {
          Actor newActor = makeActor(useActorList[i]);
          project.getActor().add(newActor);
          actorList.add(newActor);
        }
      }
    }
  }

  public void addUcSpecific(UcSpecific ucs) {
    // this.ucs = ucs;
    String sysId = ucs.getSysId();
    String id = ucs.getUcId();
    String ucName = ucs.getUcName();
    baseSys = findSystem(ucs);
    UseCase uc = findUseCase(baseSys, ucs);
    updateUseCase(uc, ucs);
    addRelatedRq(uc, ucs);
    addActor(uc, ucs);
    Map<String, EventFlow> flowMap = ucs.getFlowMap();
    flowManager = new FlowManager(uc);
    Map<String, Flow> flowModelMap = flowManager.getFlowMap();
    addFlow(uc.getFlow(), flowMap.values(), flowModelMap);
  }

  private Actor makeActor(String str) {
    Actor actor = f.createActor();
    actor.setId(str);
    actor.setObjectName("actor");
    return actor;
  }

  /**
   * 재귀 구조를 통해 EventFlow 추가. <br>
   * 깊이 우선 탐색.
   * 
   * @param flowList : EList 추가할 flowList
   * @param flowDatas : EventFlow의 값
   * @param flowModelMap : usecase에 모델에 저장된 모델 객체 맵
   */
  private void addFlow(EList<Flow> flowList, Collection<EventFlow> flowDatas,
      Map<String, Flow> flowModelMap) {
    for (EventFlow data : flowDatas) {
      SWVS.Flow flow_m = flowModelMap.get(data.id);
      if (flow_m == null) {
        flow_m = f.createFlow();
        flowList.add(flow_m);
        flowModelMap.put(data.id, flow_m);
      }
      setFlowCallRelation(flow_m, data);
      flowManager.updateFlow(flow_m, data);
      addFlow(flow_m.getDetailFlow(), data.alterEvent, flowModelMap);
    }
  }

  /**
   * 
   * @param d_list : string[] (id값, objectName 값 으로 구성된)
   * @param m_list : EList<SWVS.Object> 추가할 리스트 대상 객체
   */
  private void setList(String d_list[], EList<SWVS.Object> m_list) {
    boolean find = false;
    for (String str : d_list) {
      find = false;
      for (Actor actor : project.getActor()) { // 액터에서 찾기
        if (actor.getId().equals(str) || actor.getObjectName().equals(str)) {
          m_list.add(actor);
          find = true;
          break;
        }
      }
      if (find)
        continue;

      for (System sys : project.getSystem()) { // 시스템에서 찾기
        if (sys.getId().equals(str) || sys.getObjectName().equals(str)) {
          find = true;
          m_list.add(sys);
          break;
        }
      }
      if (find)
        continue;

      for (SWVS.Object obj : project.getObject()) { // Object에서 찾기
        if (obj.getId().equals(str) || obj.getObjectName().equals(str)) {
          find = true;
          m_list.add(obj);
          break;
        }
      } // 없으면 Obj로 추가하기
      SWVS.Object obj = f.createObject();
      obj.setId(str);
      m_list.add(obj);
    }
  }

  /**
   * host, client 설정.
   * 
   * @param flow : SWVS.Flow 모델 객체
   * @param data : EventFlow 데이터 객체
   */
  private void setFlowCallRelation(Flow flow, EventFlow data) {
    EList<SWVS.Object> hostList = flow.getHost();
    EList<SWVS.Object> clientList = flow.getClient();
    String client[] = data.clientList;
    String host[] = data.hostList;
    // TODO Auto-generated method stub
    if (host == null || host.length == 0)
      hostList.add(baseSys);
    else
      setList(host, hostList);

    if (client == null || client.length == 0)
      clientList.add(baseSys);
    else
      setList(client, clientList);

  }

  /**
   * id를 기반으로 System 모델 검색 없을시 생성하여 반환.<br>
   * 
   * @param sys
   * @param id 찾는 시스템 id
   * @param ucName 없을시 설정할 이름.
   * @return 찾거나 생성된 System
   */
  private UseCase findUseCase(System sys, UcSpecific ucs) {
    EList<UseCase> ucList = sys.getUsecase();
    for (UseCase uc : ucList) {
      if (uc.getId().equals(ucs.getUcId())) // || uc.getUsecaseName().equals(ucName))
        return uc;
      else
        continue;
    }
    SWVSPackageImpl.init();
    UseCase uc = f.createUseCase();
    ucList.add(uc);
    return uc;
  }

  private UseCase updateUseCase(UseCase uc, UcSpecific ucs) {
    uc.setId(ucs.getUcId());
    uc.setObjectName(ucs.getUcName());
    uc.setContext(ucs.getDesc());
    uc.setFilePath(ucs.getFilePath());
    uc.setObjectType("usecase Speicifc");
    Condition cond = uc.getCondition();
    if (cond == null) {
      cond = f.createCondition();
      uc.setCondition(cond);
    }
    cond.setPreCondition(ucs.getUcPreCond());
    cond.setPostCondition(ucs.getUcAftCond());
    return uc;
  }

  /**
   * id를 기반으로 검색 없다면 생성하여 project에 추가 후 반환.
   * 
   * @param findId
   * @return sys : SWVS.System
   */
  public SWVS.System findSystem(UcSpecific ucs) {
    String findId = ucs.getSysId();
    EList<System> sysList = project.getSystem();
    for (int i = 0; i < sysList.size(); i++) {
      SWVS.System sys = sysList.get(i);
      if (sys.getId().equals(findId))
        return sys;
      else
        continue;
    }

    SWVS.System sys = makeSys(ucs);
    project.getSystem().add(sys);
    return sys;
  }


  /**
   * SWVS.System 모델 생성하여 반환
   * 
   * @param ucs usecases specific
   * @return sys : SWVS.System
   */
  private System makeSys(UcSpecific ucs) {
    SWVSPackageImpl.init();
    SWVS.System sys = f.createSystem();
    sys.setObjectName(ucs.getSysName());
    sys.setId(ucs.getSysId());
    return sys;
  }

  /**
   * uc에 관련된 요구사항 프로젝트 모델에서 찾아서 추가.<br>
   * 만약 존재하지 않은 Rq라면 추가하지 않음.<br>
   * 만약 이미 추가된 Rq라면 추가하지 않음.<br>
   * 
   * @param uc : SWVS.UseCase 추가할 대상.
   * @param ucs : UcSpeicifc 추가할 정보.
   */
  private void addRelatedRq(UseCase uc, UcSpecific ucs) {
    String relatedRqList[] = ucs.getRelatedRq();
    EList<Requirement> rqModels = project.getRequirement();
    EList<Requirement> ucRequireList = uc.getRequirement();
    for (String rqId : relatedRqList) {
      for (Requirement model : rqModels) {
        if (model.getId().equals(rqId) && !uc.getRequirement().contains(model)) {
          uc.getRequirement().add(model);
        }
      }

    }
  }

  public static void main(String args[]) {

    ModelManager mmg = new ModelManager("test.swvs");
    UsecaseManager ucm = new UsecaseManager(mmg);
    UcSpecific ucs = new UcSpecific(new File("test.csv"));
    java.lang.System.out.println("Usecase Mananger Main Done");

  }
}
