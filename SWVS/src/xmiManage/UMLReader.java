package xmiManage;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SWVS.impl.SWVSPackageImpl;

public class UMLReader {

	
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
}
