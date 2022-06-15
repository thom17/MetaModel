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
   * �ɹ� ���� ������ ����.<br>
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
   * ��� ������ ���� EventFlow �߰�. <br>
   * ���� �켱 Ž��.
   * 
   * @param flowList : EList �߰��� flowList
   * @param flowDatas : EventFlow�� ��
   * @param flowModelMap : usecase�� �𵨿� ����� �� ��ü ��
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
   * @param d_list : string[] (id��, objectName �� ���� ������)
   * @param m_list : EList<SWVS.Object> �߰��� ����Ʈ ��� ��ü
   */
  private void setList(String d_list[], EList<SWVS.Object> m_list) {
    boolean find = false;
    for (String str : d_list) {
      find = false;
      for (Actor actor : project.getActor()) { // ���Ϳ��� ã��
        if (actor.getId().equals(str) || actor.getObjectName().equals(str)) {
          m_list.add(actor);
          find = true;
          break;
        }
      }
      if (find)
        continue;

      for (System sys : project.getSystem()) { // �ý��ۿ��� ã��
        if (sys.getId().equals(str) || sys.getObjectName().equals(str)) {
          find = true;
          m_list.add(sys);
          break;
        }
      }
      if (find)
        continue;

      for (SWVS.Object obj : project.getObject()) { // Object���� ã��
        if (obj.getId().equals(str) || obj.getObjectName().equals(str)) {
          find = true;
          m_list.add(obj);
          break;
        }
      } // ������ Obj�� �߰��ϱ�
      SWVS.Object obj = f.createObject();
      obj.setId(str);
      m_list.add(obj);
    }
  }

  /**
   * host, client ����.
   * 
   * @param flow : SWVS.Flow �� ��ü
   * @param data : EventFlow ������ ��ü
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
   * id�� ������� System �� �˻� ������ �����Ͽ� ��ȯ.<br>
   * 
   * @param sys
   * @param id ã�� �ý��� id
   * @param ucName ������ ������ �̸�.
   * @return ã�ų� ������ System
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
   * id�� ������� �˻� ���ٸ� �����Ͽ� project�� �߰� �� ��ȯ.
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
   * SWVS.System �� �����Ͽ� ��ȯ
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
   * uc�� ���õ� �䱸���� ������Ʈ �𵨿��� ã�Ƽ� �߰�.<br>
   * ���� �������� ���� Rq��� �߰����� ����.<br>
   * ���� �̹� �߰��� Rq��� �߰����� ����.<br>
   * 
   * @param uc : SWVS.UseCase �߰��� ���.
   * @param ucs : UcSpeicifc �߰��� ����.
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
