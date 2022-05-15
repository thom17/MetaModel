package xmiManage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import SWVS.Actor;
import SWVS.Condition;
import SWVS.Flow;
import SWVS.Project;
import SWVS.SWVSFactory;
import SWVS.SWVSPackage;
import SWVS.System;
import SWVS.UseCase;
import SWVS.impl.SWVSPackageImpl;
import fileLoader.EventFlow;
import fileLoader.UcSpecific;

public class UsecaseManager 
{
	SWVS.System baseSys;
	ModelManager mmg;
	Project project;
	SWVSFactory f;
	UcSpecific ucs;
	
	public UsecaseManager(ModelManager mmg, UcSpecific ucs)
	{
		this.mmg = mmg;
		f = SWVSFactory.eINSTANCE;
		SWVSPackageImpl.init();
		project = mmg.project;
		addUcSpecific(ucs);
		mmg.xmiReader.save();
	}
	public void addUcSpecific(UcSpecific ucs)
	{
		this.ucs = ucs;
		String sysName = ucs.getSysName();
		String sysId = ucs.getSysId();
		String id = ucs.getUcId();
		String ucName = ucs.getSysName();
		baseSys = findSystem(sysId);
		UseCase uc = findUseCase(baseSys, id, ucName);
		
		EList<Actor> actorList = uc.getActActors();
		String useActorList[] = ucs.getUseActor(); 
		if(useActorList != null)
		{
			for(int i=0; i<useActorList.length; i++)
			{
				for(Actor actor : project.getActor())
				{
					if(actor.getId().equals(useActorList[i]) || actor.getObjectName().equals(useActorList[i]))
					{
						actorList.add(actor);
						break;
					}
				}
				if(actorList.size() == i)
				{
					Actor newActor = makeActor(useActorList[i]);
					actorList.add(newActor);
					project.getActor().add(newActor);
				}
			}
		}
		Map<String, EventFlow> flowMap = ucs.getFlowMap();
		addFlow(uc.getFlow(), flowMap.values(), new Stack<EventFlow>());
	}
	
	private Actor makeActor(String str) 
	{
		Actor actor = f.createActor();
		actor.setId(str);
		actor.setObjectName(str);
		
		return actor;
	}
	private void addFlow(EList<Flow> flowList, Collection<EventFlow> collection, Stack<EventFlow> stack) 
	{
		for(EventFlow data : collection)
		{
			if(!stack.contains(data))
			{
				SWVS.Flow flow_m = makeFlow(data);
				flowList.add(flow_m);
				stack.add(data);
				addFlow(flow_m.getDetailFlow(), data.alterEvent, stack);
			}else
				continue;
		}			
	}

	private Flow makeFlow(EventFlow data) 
	{
		Flow flow = f.createFlow();
		flow.setContext(data.context);
		flow.setId(data.id);
		flow.setObjectName(data.name);
		flow.setResult(data.aftCond);
		flow.setFlowId(data.number);
		
		setFlowCallRelation(flow, data);
		if(0 < (data.preCond.length()+data.aftCond.length()) )
		{
			Condition cond = f.createCondition();
			cond.setPreCondition(data.preCond);
			cond.setPostCondition(data.aftCond);
			flow.getCondition().add(cond);
		}
		// TODO Auto-generated method stub
		return flow;
	}
	private void setList(String d_list[], EList<SWVS.Object> m_list)
	{
		boolean find = false;
		for(String str : d_list)
		{
			find = false;
			for(Actor actor : project.getActor() )
			{
				if( actor.getId().equals(str) || actor.getObjectName().equals(str))
				{
					m_list.add(actor);	
					find = true;
					break;
				}
			}
			if(find)
				continue;
			
			for(System sys : project.getSystem() )
			{
				if(sys.getId().equals(str) || sys.getObjectName().equals(str))
				{
					find = true;
					m_list.add(sys);	
					break;
				}
			}
			if(find)
				continue;
			
			for(SWVS.Object obj : project.getObject() )
			{
				if(obj.getId().equals(str) || obj.getObjectName().equals(str) )
				{
					find = true;
					m_list.add(obj);
					break;
				}
			}
			SWVS.Object obj = f.createObject();
			obj.setId(str);	
			m_list.add(obj);
		}
	}
	private void setFlowCallRelation(Flow flow, EventFlow data) 
	{
		EList<SWVS.Object> hostList = flow.getHost();
		EList<SWVS.Object> clientList = flow.getClient();
		String client[] = data.clientList;
		String host[] = data.hostList;
		// TODO Auto-generated method stub
		if(host == null || host.length == 0)
			hostList.add(baseSys);
		else
			setList(host, flow.getHost());

		if(client == null || client.length == 0)
			clientList.add(baseSys);
		else
			setList(client, flow.getClient());
		
	}
	private UseCase findUseCase(System sys, String id, String ucName) 
	{
		EList<UseCase> ucList = sys.getUsecase();
		for(UseCase uc : ucList)
		{
			if(uc.getId().equals(id) ) //|| uc.getUsecaseName().equals(ucName))
				return uc;
			else
				continue;
		}
		UseCase uc = makeUseCase(id, ucName);
		ucList.add(uc);
		return uc;
	}
	private UseCase makeUseCase(String id, String ucName) 
	{
		SWVSPackageImpl.init();
		UseCase uc = f.createUseCase();
		uc.setId(id);
		uc.setUsecaseName(ucName);
		uc.setContext(ucs.getDesc());
		uc.setObjectName(ucName);
		return uc;
	}

	public SWVS.System findSystem(String findId)
	{
		EList<System> sysList = project.getSystem();
		for(int i=0; i<sysList.size(); i++)
		{
			SWVS.System sys = sysList.get(i);
			if(sys.getId().equals(findId))
				return sys;
			else
				continue;		
		}	
		SWVS.System sys = makeSys(findId);
		project.getSystem().add(sys);
		return sys;
	}
	private System makeSys(String findId) 
	{
		SWVSPackageImpl.init();
		SWVS.System sys = f.createSystem();
		sys.setObjectName(findId);
		sys.setId(ucs.getSysId());
		return sys;
	}
	public static void main(String args[])
	{

		UcSpecific ucs  = new UcSpecific(new File("test.csv"));
		ModelManager mmg = new ModelManager("test.swvs");
		UsecaseManager ucm = new UsecaseManager(mmg, ucs);
		java.lang.System.out.println("Usecase Mananger Main Done");
		
	}
}
