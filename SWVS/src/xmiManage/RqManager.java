package xmiManage;

import java.io.File;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.SWVSFactory;
import SWVS.impl.SWVSPackageImpl;
import fileLoader.Req;
import fileLoader.RqSpecific;

/**
 * RqTable ������ �а� ���� �߰����ִ� Ŭ����.<br>
 * 
 * @author thom1
 *
 */
public class RqManager {


  ModelManager mmg;
  Project project;
  SWVSFactory f;
  RqSpecific rqs;

  public static void main(String argsp[]) {
    RqSpecific rqs = new RqSpecific(new File("RqTable.csv"));
    ModelManager mmg = new ModelManager("test.swvs");
    RqManager ucm = new RqManager(mmg);
    java.lang.System.out.println("Rqs Mananger Main Done");
  }

  /**
   * �ɹ��� �ʱ�ȭ.<br>
   * �⺻������ ���� ������ �ʴ´�.
   *
   * @param mmg
   */
  public RqManager(ModelManager mmg) {
    this.mmg = mmg;
    f = SWVSFactory.eINSTANCE;
    SWVSPackageImpl.init();
    project = mmg.project;
  }

  /**
   * RqTable ��ü�� RqSpecific�� �Է¹޾� Requriement ���� �߰�.<br>
   * �̹� �ߺ��� �� ������ �Էµ� ������ ����
   * 
   * @param rqs : RqSpecific (�䱸���� ���̺� ����)
   */
  public void addRq(RqSpecific rqs) {
    Map<String, Req> reqMap = rqs.getReqMap();

    for (Req info : reqMap.values()) {
      Requirement rq = findById(info.id);
      rqModelSet(rq, info);
    }
  }

  /**
   * �������� �䱸���� ���� �����ϴ� �Լ�<br>
   * 
   * @param rq
   * @param info
   */
  private void rqModelSet(Requirement rq, Req info) {
    rq.setContents(info.desc);
    rq.setDepartment(info.depertment);
    rq.setFilePath(info.filePath);
    rq.setRqType(info.type);
    rq.setObjectName(info.rqName);
  }

  /**
   * �ִٸ� �ش� �� ��ü�� ��ȯ.<br>
   * ���ٸ� �����Ͽ� ��ȯ. (id�� �����Ͽ�)
   * 
   * @param id
   * @return SWVS.Requirement
   */
  public Requirement findById(String id) {
    EList<Requirement> rqList = project.getRequirement();
    for (Requirement rq : rqList) {
      if (rq.getId().equals(id))
        return rq;
    }

    Requirement req = f.createRequirement();
    req.setId(id);
    rqList.add(req);
    return req;
  }
}
