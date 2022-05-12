package xmiManage;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SWVS.Flow;
import SWVS.Method;
import SWVS.Project;
import SWVS.impl.SWVSPackageImpl;
import codeGenerater.JavaCodeGenerater;

import diagram.ClassDg;
import diagram.SequenceDg;
import diagram.UsecaseDg;

public class XmiReader 
{
	Project project;
	Resource resource;	
	
	public XmiReader(String filePath)
	{
		resource = XmiReader.readMetaModel(filePath);
		project = (Project) resource.getContents().get(0);
	}
	
	public Project getProject()
	{
		return project;
	}
	
	public boolean isInClass(String srcName)
	{
		for(SWVS.Class cls :  project.getClass_())
		{
			if(cls.getData_base_SrcName().equals(srcName))
				return true;
		}
		return false;
	}
	public void save()
	{
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Resource readMetaModel(String fileName)
	{
		SWVSPackageImpl.init();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
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
	public static void main(String fileName)
	{
		XmiReader xmi = new XmiReader(fileName);
		System.out.println("20101005-----------");
		//Project project = (Project)XmiReader.readMetaModel("MY.swvs").get(0);
		Project project = xmi.getProject();
		System.out.println("Read "+project);
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

		System.out.print("XmiReader.main(String[] ) Done");
	}
	
	public static void main(String args[]) throws IOException
	{
		//test();
		XmiReader xmi = new XmiReader("RDOM/Dice.swvs");
		System.out.println("20101005-----------");
		//Project project = (Project)XmiReader.readMetaModel("MY.swvs").get(0);
		Project project = xmi.getProject();
		System.out.println("Read "+project);
		UsecaseDg.main(project);
		ClassDg.main(project);
		SequenceDg.main(project);
		JavaCodeGenerater maker = new JavaCodeGenerater(project);
		maker.make();
		xmi.save();

		System.out.print("XmiReader.main(String[] ) Done");
	}

	private static void test() {
		// TODO Auto-generated method stub
		XmiReader xmi = new XmiReader("Wpm.swvs");
		Method m=xmi.getProject().getClass_().get(0).getMethod().get(0);
		Flow fl =m.getFlow().get(0);
		EObject ob =fl.eContainer();
		int i=0;
	}

}
