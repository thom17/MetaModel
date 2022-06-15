package xmiManage;

import java.io.File;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import SWVS.Class;
import SWVS.Field;
import SWVS.Flow;
import SWVS.Method;
import SWVS.Object;
import SWVS.Project;
import SWVS.SWVSFactory;
import SWVS.System;
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
  public EList<System> systemList;
  public EList<Class> classList;
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
    classList = project.getClass_();
    systemList = project.getSystem();
  }

  public EList<Class> getClassList() {
    return classList;
  }

  /**
   * data_base_src의 값을 검색하여 Class 검색
   * 
   * @param data_base_src
   * @return 있다면 SWVS.Class or null
   */
  public Class findClassBySrc(String data_base_src) {
    for (Class cls : classList) {
      if (cls.getData_base_SrcName().equals(data_base_src))
        return cls;
    }
    return null;
  }

  /**
   * 
   * @param srcClassName
   * @param srcMethodName
   * @return
   */
  public boolean checkIsMethod(String srcClassName, String srcMethodName) {
    Class cls = findClassBySrc(srcClassName);
    if (cls == null)
      return false;
    for (Object fun : cls.getMethod()) {
      if (fun.getData_base_SrcName().equals(srcMethodName))
        return true;
    }
    return false;
  }

  public void implementM(Method m, String srcName) {
    if (m.getUsecase() == null)
      for (Object fl : m.getBase()) {
        fl.setData_base_SrcName(srcName);
        EObject usecase = fl.eContainer();
      }
    else
      m.getUsecase().setData_base_SrcName(srcName);
    xmiReader.save();
  }



  public void addMethod(Class cls, String sig) {
    if (cls == null)
      return;
    SWVSPackageImpl.init();
    Method function = f.createMethod();
    cls.getMethod().add(function);
    function.setData_base_SrcName(cls.getData_base_SrcName() + "." + sig);
    function.setObjectType("function");
    function.setAddedObject(true);
    xmiReader.save();
  }

  public void addMethod(String clsSrcName, String name, String sig) {
    Class cls = findClassBySrc(clsSrcName);
    if (cls == null)
      return;
    SWVSPackageImpl.init();
    Method function = f.createMethod();
    cls.getMethod().add(function);
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
