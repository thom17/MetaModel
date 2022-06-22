package xmiManage;

import java.io.File;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import SWVS.Field;
import SWVS.Flow;
import SWVS.MClass;
import SWVS.MMethod;
import SWVS.MObject;
import SWVS.MSystem;
import SWVS.Project;
import SWVS.SWVSFactory;
import SWVS.impl.SWVSPackageImpl;
import codeGenerater.JavaCodeGenerater;
import diagram.ClassDg;
import diagram.SequenceDg;
import diagram.UsecaseDg;
import fileLoader.UcSpecific;

/**
 * 각각의 Manager를 통합한 메인 메니저.<br>
 * 
 * @author thom1
 *
 */
public class ModelManager {
  XmiReader xmiReader;
  UsecaseManager usecaseManager = new UsecaseManager(this);
  RqManager rqManager = new RqManager(this);

  public Project project;
  public EList<MSystem> systemList;
  public EList<MClass> classList;
  public Field fieldList[];
  public Flow flowList[];

  SWVSFactory f = SWVSFactory.eINSTANCE; // 모델 생성자.

  /**
   * 
   * @param filePath .swvs 파일의 경로
   */
  public ModelManager(String filePath) {
    xmiReader = new XmiReader(filePath);
    project = (Project) xmiReader.getRoot();
    classList = project.getClassList();
    systemList = project.getSystems();
  }

  public EList<MClass> getClassList() {
    return classList;
  }

  /**
   * data_base_src의 값을 검색하여 Class 검색
   * 
   * @param data_base_src
   * @return 있다면 SWVS.Class or null
   */
  public MClass findClassBySrc(String data_base_src) {
    for (MClass cls : classList) {
      if (cls.getData_base_SrcName().equals(data_base_src))
        return cls;
    }
    return null;
  }

  /**
   * 
   * @param srcClassName
   * @param srcMMethodName
   * @return
   */
  public boolean checkIsMMethod(String srcClassName, String srcMMethodName) {
    MClass cls = findClassBySrc(srcClassName);
    if (cls == null)
      return false;
    for (MObject fun : cls.getMethods()) {
      if (fun.getData_base_SrcName().equals(srcMMethodName))
        return true;
    }
    return false;
  }

  public void implementM(MMethod m, String srcName) {
    if (m.getTestUsecase() == null)
      for (MObject fl : m.getBase()) {
        fl.setData_base_SrcName(srcName);
        EObject usecase = fl.eContainer();
      }
    else
      m.getTestUsecase().setData_base_SrcName(srcName);
    xmiReader.save();
  }



  public void addMMethod(MClass cls, String sig) {
    if (cls == null)
      return;
    SWVSPackageImpl.init();
    MMethod function = f.createMMethod();
    cls.getMethods().add(function);
    function.setData_base_SrcName(cls.getData_base_SrcName() + "." + sig);
    function.setObjectType("function");
    function.setAddedObject(true);
    xmiReader.save();
  }

  public void addMMethod(String clsSrcName, String name, String sig) {
    MClass cls = findClassBySrc(clsSrcName);
    if (cls == null)
      return;
    SWVSPackageImpl.init();
    MMethod function = f.createMMethod();
    cls.getMethods().add(function);
    function.setData_base_SrcName(cls.getData_base_SrcName() + "." + sig);
    function.setObjectType("function");
    function.setObjectName(name);
    function.setAddedObject(true);
    xmiReader.save();
  }

  public void readUseCaseSpec(File file) {
    UcSpecific ucSpec = new UcSpecific(file);
    usecaseManager.addUcSpecific(ucSpec);

  }

  public void save() {
    xmiReader.save();
  }

  public static void main(String fileName) {
    XmiReader xmi = new XmiReader(fileName);
    java.lang.System.out.println("20101005-----------");
    // Project project = (Project)XmiReader.readMetaModel("MY.swvs").get(0);
    Project project = (Project) xmi.getRoot();
    java.lang.System.out.println("Read " + project);
    try {
      UsecaseDg.main(project);
      ClassDg.main(project);
      SequenceDg.main(project);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    JavaCodeGenerater maker = new JavaCodeGenerater(project);
    maker.make();
    xmi.save();

    java.lang.System.out.print("XmiReader.main(String[] ) Done");
  }

  public static void main(String args[]) throws IOException {
    // test();
    XmiReader xmi = new XmiReader("RDOM/Dice.swvs");
    java.lang.System.out.println("20101005-----------");
    // Project project = (Project)XmiReader.readMetaModel("MY.swvs").get(0);
    Project project = (Project) xmi.getRoot();
    java.lang.System.out.println("Read " + project);
    UsecaseDg.main(project);
    ClassDg.main(project);
    SequenceDg.main(project);
    JavaCodeGenerater maker = new JavaCodeGenerater(project);
    maker.make();
    xmi.save();

    java.lang.System.out.print("XmiReader.main(String[] ) Done");
  }
}
