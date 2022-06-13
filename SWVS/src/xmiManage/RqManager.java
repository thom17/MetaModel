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
 * RqTable 파일을 읽고 모델을 추가해주는 클래스.<br>
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
   * 맴버값 초기화.<br>
   * 기본적으로 변경 하지는 않는다.
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
   * RqTable 객체인 RqSpecific을 입력받아 Requriement 모델을 추가.<br>
   * 이미 중복된 모델 정보는 입력된 정보로 수정
   * 
   * @param rqs : RqSpecific (요구사항 테이블 정보)
   */
  public void addRq(RqSpecific rqs) {
    Map<String, Req> reqMap = rqs.getReqMap();

    for (Req info : reqMap.values()) {
      Requirement rq = findById(info.id);
      rqModelSet(rq, info);
    }
  }

  /**
   * 직접적인 요구사항 모델을 설정하는 함수<br>
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
   * 있다면 해당 모델 객체를 반환.<br>
   * 없다면 생성하여 반환. (id만 설정하여)
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
