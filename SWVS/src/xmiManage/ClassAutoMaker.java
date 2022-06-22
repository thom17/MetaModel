package xmiManage;

import SWVS.Flow;
import SWVS.MClass;
import SWVS.MMethod;
import SWVS.MSystem;
import SWVS.SWVSFactory;
import SWVS.UseCase;

/**
 * Ŭ���� ���̾�׷��� �ڵ����� ����.<br>
 * ���� ������ �������� �ʴ´�.<br>
 * 
 * @author thom1
 *
 */
public class ClassAutoMaker {
  String basePackage = "default";
  ModelManager mmg;
  SWVSFactory f;

  public static void main(String args[]) {
    ModelManager mmg = new ModelManager("test.swvs");
    new ClassAutoMaker(mmg);
  }

  public ClassAutoMaker(ModelManager mmg) {
    this.mmg = mmg;
    f = mmg.f;
  }

  /**
   * System2Class<br>
   * usecase2Method<br>
   * flow2method<br>
   */
  public void autoMake() {
    // TODO Auto-generated method stub
    system2Class();
    basePackage = mmg.project.getProjectName();
  }

  /**
   * ObjectType autoGenClass<br>
   * ClassType SystemClass<br>
   * 
   */
  private void system2Class() {
    // TODO Auto-generated method stub
    for (MSystem sys : mmg.systemList) {
      MClass cls = f.createMClass();
      cls.setId("cls-" + sys.getId());
      cls.setObjectName(getClassName(sys));
      cls.getDefBase().add(sys);
      cls.setPackage(basePackage);
      cls.setObjectType("autoGenClass");
      cls.setClassType("SystemClass");
      sys.getDefClass().add(cls);
      mmg.project.getClassList().add(cls);
      for (UseCase uc : sys.getUsecase())
        usecase2Method(cls, uc);
    }
  }

  /**
   * Sys�� objName�� ������ �װ�����<br>
   * ���ٸ� id��
   * 
   * @param sys : Ŭ����ȭ �� �ý���
   * @return name : string
   */
  private String getClassName(MSystem sys) {
    if (sys.getObjectName() == null || sys.getObjectName().length() < 1) {
      return sys.getId();
    } else
      return sys.getObjectName();
  }

  private void usecase2Method(MClass cls, UseCase uc) {
    // TODO Auto-generated method stub

    MMethod fun = f.createMMethod();

    fun.setTestUsecase(uc);
    fun.setId("fun-" + uc.getId());
    fun.setObjectName(getMethodName(uc));
    fun.setReturnType("void");
    fun.setObjectType("autoGenFunUc");
    cls.getMethods().add(fun);
    for (Flow fl : uc.getFlows()) {
      fun.getBase().add(fl);
      flow2Method(cls, fl);
    }
  }

  /**
   * method signature ���ϱ�<br>
   * Usecase ��� ObejctName ���ٸ� Id<br>
   * 
   * @param uc
   * @return
   */
  private String getMethodName(UseCase uc) {
    String name = "";
    if (uc.getObjectName() == null || uc.getObjectName().length() < 1) {
      name = uc.getId() + "()";
    } else {
      name = uc.getObjectName();
      name = name.replaceAll(" ", "") + "()";
      name = Character.toLowerCase(name.charAt(0)) + name.substring(1);
    }
    return name;
  }

  private void flow2Method(MClass cls, Flow fl) {
    // TODO Auto-generated method stub
    MMethod fun = f.createMMethod();
    fun.setId(fl.getId());
    fun.setObjectName(fl.getObjectName());
    fun.getBase().add(fl);
    fun.setReturnType("void");
    fun.setObjectType("autoGenFunFlow");
    cls.getMethods().add(fun);
  }

}
