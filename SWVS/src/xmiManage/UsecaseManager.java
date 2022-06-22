package xmiManage;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import SWVS.Actor;
import SWVS.Condition;
import SWVS.Flow;
import SWVS.MObject;
import SWVS.MSystem;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.SWVSFactory;
import SWVS.UseCase;
import SWVS.impl.SWVSPackageImpl;
import fileLoader.EventFlow;
import fileLoader.UcSpecific;

public class UsecaseManager {
  MSystem baseSys;
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
        for (Actor actor : project.getActorList()) {
          if (actor.getId().equals(useActorList[i])
              || actor.getObjectName().equals(useActorList[i])) {
            actorList.add(actor);
            break;
          }
        }
        if (actorList.size() == i) {
          Actor newActor = makeActor(useActorList[i]);
          project.getActorList().add(newActor);
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
    addFlow(uc.getFlows(), flowMap.values(), flowModelMap);
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
      addFlow(flow_m.getDetailFlows(), data.alterEvent, flowModelMap);
    }
  }

  /**
   * 
   * @param d_list : string[] (id��, objectName �� ���� ������)
   * @param m_list : EList<MObject> �߰��� ����Ʈ ��� ��ü
   */
  private void setList(String d_list[], EList<MObject> m_list) {
    boolean find = false;
    for (String str : d_list) {
      find = false;
      for (Actor actor : project.getActorList()) { // ���Ϳ��� ã��
        if (actor.getId().equals(str) || str.equals(actor.getObjectName())) {
          m_list.add(actor);
          find = true;
          break;
        }
      }
      if (find)
        continue;

      for (MSystem sys : project.getSystems()) { // �ý��ۿ��� ã��
        if (sys.getId().equals(str) || str.equals(sys.getObjectName())) {
          find = true;
          m_list.add(sys);
          break;
        }
      }
      if (find)
        continue;

      for (MObject obj : project.getObjects()) { // Object���� ã��
        if (obj.getId().equals(str) || str.equals(obj.getObjectName())) {
          find = true;
          m_list.add(obj);
          break;
        }
      } // ������ Obj�� �߰��ϱ�
      MObject obj = f.createMObject();
      obj.setId(str);
      obj.setObjectName(getSimpleName(str));
      m_list.add(obj);
    }
  }

  private String getSimpleName(String str) {
    String match = "[^\uAC00-\uD7A30-9a-zA-Z]";
    str = str.replaceAll(match, "");
    str = str.toUpperCase();
    // TODO Auto-generated method stub
    return str;
  }

  /**
   * host, client ����.
   * 
   * @param flow : SWVS.Flow �� ��ü
   * @param data : EventFlow ������ ��ü
   */
  private void setFlowCallRelation(Flow flow, EventFlow data) {
    EList<MObject> hostList = flow.getHost();
    EList<MObject> clientList = flow.getClients();
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
  private UseCase findUseCase(MSystem sys, UcSpecific ucs) {
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
   * @return sys : MSystem
   */
  public MSystem findSystem(UcSpecific ucs) {
    String findId = ucs.getSysId();
    EList<MSystem> sysList = project.getSystems();
    for (int i = 0; i < sysList.size(); i++) {
      MSystem sys = sysList.get(i);
      if (sys.getId().equals(findId))
        return sys;
      else
        continue;
    }

    MSystem sys = makeSys(ucs);
    project.getSystems().add(sys);
    return sys;
  }


  /**
   * MSystem �� �����Ͽ� ��ȯ
   * 
   * @param ucs usecases specific
   * @return sys : MSystem
   */
  private MSystem makeSys(UcSpecific ucs) {
    SWVSPackageImpl.init();
    MSystem sys = f.createMSystem();
    String sysName = ucs.getSysName();
    if (sysName == null || sysName.length() < 1)
      sysName = this.getSimpleName(ucs.getSysId());
    sys.setObjectName(sysName);
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
    EList<Requirement> ucRequireList = uc.getRequirements();
    for (String rqId : relatedRqList) {
      for (Requirement model : rqModels) {
        if (model.getId().equals(rqId) && !uc.getRequirements().contains(model)) {
          uc.getRequirements().add(model);
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
