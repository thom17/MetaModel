package xmiManage;

import SWVS.Project;
import SWVS.SWVSFactory;
import SWVS.Field;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SWVS.Object;
import SWVS.Class;
import SWVS.Flow;
import SWVS.Function;
import SWVS.Method;
import SWVS.System;
import SWVS.impl.SWVSPackageImpl;
import fileLoader.UcSpecific;

public class ModelManager 
{
	XmiReader xmiReader;

	public Project project;
	public EList<System> systemList;
	public EList<Class> classList;
	public Field fieldList[];
	public Flow flowList[];
	
	SWVSFactory f = SWVSFactory.eINSTANCE;
	
	public ModelManager(String filePath)
	{
		xmiReader = new XmiReader(filePath);
		project = xmiReader.getProject();
		classList = project.getClass_();
		systemList = project.getSystem();
	}
	public EList<Class> getClassList(){return classList;}
	
	public void test(String fileName)
	{
		SWVSPackageImpl.init();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		String pathName = new File(fileName).getAbsolutePath();
		URI fileURI = URI.createFileURI(pathName);
		Resource resource = resourceSet.createResource(fileURI);
	}
	
	public Class findClass(String srcName)
	{
		for(Class cls : classList)
		{
			if( cls.getData_base_SrcName().equals(srcName) )
				return cls;
		}
		return null;
	}
	
	public boolean checkIsMethod(String srcClassName, String srcMethodName)
	{
		Class cls = findClass(srcClassName);
		if(cls == null)
			return false;
		for(Object fun : cls.getMethod())
		{
			if (fun.getData_base_SrcName().equals(srcMethodName) )
				return true;
		}
		return false;
	}
	public void implementM(Method m , String srcName)
	{
		if(m.getUsecase() == null)
			for(Flow fl : m.getFlow())
			{
				fl.setData_base_SrcName(srcName);
				EObject usecase = fl.eContainer();			
			}
		else
			m.getUsecase().setData_base_SrcName(srcName);
		xmiReader.save();
	}
	public void addMethod(Class cls, String sig)
	{
		if(cls == null)
			return;
		SWVSPackageImpl.init();
		Method function = f.createMethod();
		cls.getMethod().add(function);
		function.setData_base_SrcName(cls.getData_base_SrcName()+"."+sig);
		function.setObjectType("function");
		function.setAddedObject(true);
		xmiReader.save();
	}
	
	public void addMethod(String clsSrcName, String name, String sig)
	{
		Class cls = findClass(clsSrcName);
		if(cls == null)
			return;
		SWVSPackageImpl.init();
		Method function = f.createMethod();
		cls.getMethod().add(function);
		function.setData_base_SrcName(cls.getData_base_SrcName()+"."+sig);
		function.setObjectType("function");
		function.setObjectName(name);
		function.setAddedObject(true);
		xmiReader.save();
	}
	public void readUseCaseSpec(File file)
	{
		UcSpecific ucSpec = new UcSpecific(file);
		UsecaseManager umg = new UsecaseManager(this, ucSpec);
		
	}
	
	public void save() {
		xmiReader.save();	
	}

}
