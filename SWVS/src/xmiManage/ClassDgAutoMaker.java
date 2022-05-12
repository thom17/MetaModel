package xmiManage;

import SWVS.Class;
import SWVS.Flow;
import SWVS.Method;
import SWVS.SWVSFactory;
import SWVS.UseCase;

public class ClassDgAutoMaker 
{
	String basePackage = "default";
	ModelManager mmg;
	SWVSFactory f;
	
	public static void main(String args[])
	{
		ModelManager mmg = new ModelManager("test.swvs");
		new ClassDgAutoMaker(mmg);
	}
	public ClassDgAutoMaker(ModelManager mmg)
	{
		this.mmg = mmg;
		f= mmg.f;
		autoMake();
		mmg.save();
	}
	private void autoMake() 
	{
		// TODO Auto-generated method stub
		system2Class();
		basePackage = mmg.project.getProjectName();
	}
	private void system2Class() {
		// TODO Auto-generated method stub
		for(SWVS.System sys : mmg.systemList )
		{
			SWVS.Class cls = f.createClass();
			cls.setId(sys.getId());
			cls.setObjectName(sys.getObjectName());
			cls.setPackage(basePackage);
			mmg.project.getClass_().add(cls);
			for(UseCase uc :sys.getUsecase())
				usecase2Method(cls ,uc);
		}
	}
	private void usecase2Method(Class cls, UseCase uc) 
	{
		// TODO Auto-generated method stub
		
		Method fun = f.createMethod();
		fun.setUsecase(uc);
		fun.setId(uc.getId());
		fun.setObjectName(uc.getObjectName());
		cls.getMethod().add(fun);
		for(Flow fl : uc.getFlow())
		{
			fun.getFlow().add(fl);
			flow2Method(cls, fl);
		}
	}
	private void flow2Method(Class cls, Flow fl) 
	{
		// TODO Auto-generated method stub
		Method fun = f.createMethod();
		fun.setId(fl.getId());
		fun.setObjectName(fl.getObjectName());
		fun.getFlow().add(fl);
		cls.getMethod().add(fun);
	}
	
}
