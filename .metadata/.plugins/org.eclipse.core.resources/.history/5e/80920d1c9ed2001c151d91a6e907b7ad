package xmiManage;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SWVS.Project;
import SWVS.Requirement;
import SWVS.SWVSFactory;
import SWVS.impl.SWVSPackageImpl;
import fileLoader.Req;
import fileLoader.RqSpecific;
import fileLoader.UcSpecific;

public class RqManager {

	
	ModelManager mmg;
	Project project;
	SWVSFactory f;
	RqSpecific rqs;
	
	public static void main(String argsp[])
	{
		RqSpecific rqs  = new RqSpecific(new File("RqTable.csv"));
		ModelManager mmg = new ModelManager("test.swvs");
		RqManager ucm = new RqManager(mmg, rqs);
		java.lang.System.out.println("Rqs Mananger Main Done");
	}
	public RqManager(ModelManager mmg, RqSpecific rq)
	{
		this.mmg = mmg;
		f = SWVSFactory.eINSTANCE;
		SWVSPackageImpl.init();
		project = mmg.project;
		this.rqs = rq;
		addRq(rq);
		mmg.xmiReader.save();
	}
	
	public void addRq(RqSpecific rqs)
	{
		Map<String, Req> reqMap = rqs.getReqMap();
		
		for(Req info : reqMap.values())
		{
			Requirement rq = findById(info.id);
			rqModelSet(rq, info);
		}
	}
	private void rqModelSet(Requirement rq, Req info) 
	{
		rq.setContents(info.desc);
		rq.setDepartment(info.depertment);
		rq.setFilePath(info.filePath);
		rq.setRqType(info.type);
		rq.setObjectName(info.rqName);		
	}

	public Requirement findById(String id)
	{
		EList<Requirement> rqList = project.getRequirement();
		for(Requirement rq : rqList)
		{
			if( rq.getId().equals(id))
				return rq;
		}
		
		Requirement req = f.createRequirement();
		req.setId(id);
		rqList.add(req);
		return req;
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
}
