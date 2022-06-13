package xmiManage;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import SWVS.impl.SWVSPackageImpl;

/**
 * ��Ÿ�� ������ �д� ���� �⺻���� Ŭ����.<br>
 * 
 * @author thom1
 *
 */
public class XmiReader {
  // Project project;
  public Resource resource;

  /**
   * ������ �о� Resoure ��ü�� ����.
   * 
   * @param filePath
   */
  public XmiReader(String filePath) {
    resource = XmiReader.readMetaModel(filePath);
    // project = (Project) resource.getContents().get(0);
  }

  /**
   * ���� ��� (0 ��°) �� ��ȯ
   * 
   * @return
   */
  public EObject getRoot() {
    return resource.getContents().get(0);
  }

  // public boolean isInClass(String srcName) {
  // for (SWVS.Class cls : project.getClass_()) {
  // if (cls.getData_base_SrcName().equals(srcName))
  // return true;
  // }
  // return false;
  // }
  /**
   * ���� ����
   */
  public void save() {
    try {
      resource.save(Collections.EMPTY_MAP);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * ���������� �д� �޼���
   * 
   * @param fileName
   * @return
   */
  public static Resource readMetaModel(String fileName) {
    SWVSPackageImpl.init(); // ������ ��Ű�� �̸�
    ResourceSet resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
        .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

    String pathName = new File(fileName).getAbsolutePath();
    URI fileURI = URI.createFileURI(pathName);
    Resource resource = resourceSet.createResource(fileURI);

    try {
      resource.load(Collections.EMPTY_MAP);
      EcoreUtil.resolveAll(resource);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return resource;
  }


  // private static void test() {
  // // TODO Auto-generated method stub
  // XmiReader xmi = new XmiReader("Wpm.swvs");
  // Method m = xmi.getProject().getClass_().get(0).getMethod().get(0);
  // Flow fl = m.getFlow().get(0);
  // EObject ob = fl.eContainer();
  // int i = 0;
  // }

}
