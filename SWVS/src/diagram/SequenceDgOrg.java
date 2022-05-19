package diagram;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import SWVS.Actor;
import SWVS.Class;
import SWVS.Flow;
import SWVS.Project;
import SWVS.System;
import SWVS.UseCase;
import SWVS.Object;
public class SequenceDgOrg extends Base
{
	System system;
	Actor actor;
	
	public SequenceDgOrg(System system)
	{
		this.system = system;
		this.fileName = system.getObjectName();
		this.sb = new StringBuilder();
		this.path = "model";		
	}
	public SequenceDgOrg(Actor actor)
	{
		this.actor = actor;
		this.fileName = actor.getObjectName()+"_Seq";
		this.sb = new StringBuilder();
		this.path = "model";		
	}
	
	public static SequenceDgOrg[] main(Project project) throws IOException
	{
		EList<Actor> actorList = project.getActor();
		SequenceDgOrg list[] = new SequenceDgOrg[actorList.size()];
		for(int i=0; i<actorList.size(); i++)
		{
			list[i] = new SequenceDgOrg(actorList.get(i));
			list[i].draw();
			list[i].make();
		}
		return list;
	}
	
	@Override
	protected void draw() 
	{
		sb.append("@startuml\n");
		for(UseCase usecase : actor.getActUsecases())
		{
			sb.append("group "+usecase.getId()+" "+usecase.getObjectName()+"\n");
			drawUsecase(usecase);
			sb.append("end\n");
		}
		sb.append("@enduml\n");
		
	}

	private void drawUsecase(UseCase usecase) 
	{
		String tab = "\t";
		for(Flow flow : usecase.getFlow())
		{
			//sb.append("group "+usecase.getId()+" "+usecase.getUsecaseName()+"\n");
			drawFlow(flow, tab);
			//sb.append("end\n");
		}
	}

	private Flow drawFlow(Flow flow, String tab) 
	{	
		Object client = findActor(flow.getClient());
	    Object host = findActor(flow.getHost());
	    Flow end = flow;
	    String clientName = client.getObjectName();
	    if(client instanceof Actor)
	    	clientName = ((Actor) client).getObjectName();
	    
	    EList<Flow> detaileflowList = flow.getDetailFlow();
	    
	    if(0 < detaileflowList.size())	//상세 flow 있다면 그룹 생성
	    {
	    	sb.append(tab+"group "+flow.getObjectName()+"\n");
	    	for(Flow detailFlow : detaileflowList)
	    	{
	    		end = drawFlow(detailFlow, tab+"\t");
	    	}    	
	    	Object endHost = findActor(end.getHost());
	    	sb.append(tab+endHost.getObjectName()+"-->"+host.getObjectName()+" : "+flow.getResult()+"\n");
	    	sb.append(tab+"end\n");
	    }else	//없다면 단순 생성
	    	  sb.append(tab+clientName +"->"+host.getObjectName()+" : "+flow.getObjectName()+"\n");
	    
		return flow;
	}
	private Object findActor(EList<Object> list) 
	{
		for(Object ob : list)
			if(ob instanceof Flow)
				continue;
			else
				return ob;
		return null;
	}
}
