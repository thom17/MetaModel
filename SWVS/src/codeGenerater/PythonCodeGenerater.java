package codeGenerater;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import SWVS.Class;
import SWVS.Field;
import SWVS.Flow;
import SWVS.Method;
import SWVS.Object;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.UseCase;

public class PythonCodeGenerater 
{
	String codePath = "autoGen/src";
	Project project;
	EList<Class> classList;
	File filePath;
	
	public PythonCodeGenerater(Project project)
	{
		this.project = project;
		classList = project.getClass_();
	
	}
	private void makeTimePath() 
	{
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm");//mm-ss
		String time =  format.format(date);
		String src = "autoGen"+"/"+time;
		File folder = new File(src);
		folder.mkdir();
		src += "/src";
		folder = new File(src);
		folder.mkdir();
		codePath = src;	
	}
	protected void makeFile(String code) throws IOException
	{
		FileWriter fw = new FileWriter(filePath, false);
		fw.write(code);
		fw.close();	
	}
	public void make()
	{
		makeTimePath();
		for(Class cls : classList)
		{
			filePathSet(cls);
			String code = makeCode(cls);
			try {
				makeFile(code);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}	
	}

	private String makeCode(Class cls) 
	{
		StringBuilder sb = new StringBuilder();
		makeImportDef(cls, sb);
		sb.append("\n");
		makeClassDef(cls, sb);
		sb.append("\n");
		return sb.toString();
	}

	private void makeMethod(Class cls, StringBuilder sb) 
	{
		for(Method method : cls.getMethod())
		{
			if(method.getUsecase() == null)		
				for(Flow flow : method.getFlow())
				{
					makeMethodBlock( flow, method ,sb);
					sb.append("\n");
				}
			else
			{
				makeMethodBlock(method, sb);
				sb.append("\n");
			}
		}
		
	}
	//Use case Method Blcok
    {
		String tab = "\t";
    	String intab = "\t\t";
    	String sig = method.getObjectName();
    	sig = sig.replace("(", "(self, ");
		sb.append(tab+"def "+ sig +":\n");
		String comment = makeMethodComment(method.getUsecase(), intab);
		sb.append(comment);
		callExp(method.getFlow(), sb, intab);
	
    	sb.append("\n");
    	
		// TODO Auto-generated method stub
		
	}//���� �����ؾߵ� ��ǻ�
	private void makeMethodBlock(Flow flow, Method method, StringBuilder sb) 
    {
		String tab = "\t";
    	String intab = "\t\t";
    	
    	String sig = method.getObjectName();
    	sig = sig.replace("(", "(self, ");
    	
		sb.append(tab+"def "+ sig +":\n");
		String comment = makeMethodComment(flow, intab);
		sb.append(comment);
		
		callExp(flow.getDetailFlow(), sb, intab);
    	sb.append("\n");
    	
		// TODO Auto-generated method stub
		
	}
	
	private String makeMethodComment(UseCase uc, String tab) {
		StringBuilder sb = new StringBuilder(tab+"/**"+uc.getId()+"\n");
		sb.append(tab+uc.getContext()+"\n");
		sb.append(tab+"*/\n");
		return sb.toString();
	}
	private String makeMethodComment(Flow flow, String tab) 
    {
		StringBuilder sb = new StringBuilder(tab+"\"\"\" "+flow.getId()+"\n");
		sb.append(tab+flow.getContext()+"\n\n");
		sb.append(tab+"return "+flow.getResult()+"\n");
		sb.append(tab+"\"\"\"\n");
		return sb.toString();
	}

	private Object getHost(EList<Object> eList)
	{
		for(Object ob : eList)
		{
			if(ob instanceof Class || ob instanceof SWVS.System)
				return ob;
		}
		return null;
	}
	
	private void callExp(EList<Flow> flowList, StringBuilder sb, String tab)
	{
		for(Flow callMethod : flowList)
		{
			//�� ���� ���� ����?
			Object host = getHost(callMethod.getHost());
			String hostName="";
			if(host != null)
				hostName = host.getObjectName()+".";
			String callLine = hostName+callMethod.getObjectName();
			sb.append(tab+"#"+callMethod.getContext()+tab+callMethod.getId()+"\n");
			sb.append(tab+callLine+"\n");
		}
	}




	private void makeImportDef(Class cls, StringBuilder sb) 
	{
		for(Class has : cls.getHasClass())
		{
			String packageName = has.getPackage();
			String name = has.getObjectName();
			String importStr = "from "+packageName+" import "+name;
			sb.append(importStr+"\n");
		}
		
	}
	private void makeClassComment(Class cls, StringBuilder sb)
	{
		sb.append("\t\"\"\"\n");
		for(Requirement rq : project.getRequirement())
		{
			sb.append("\t"+rq.getId()+":"+rq.getContents()+"\n");
		}
		for(Object ob : cls.getDefBase())
		{
			if(ob instanceof SWVS.System)
			{
				SWVS.System sys = (SWVS.System)ob;
				sb.append(sys.getId()+"\n");
				for(Requirement rq : sys.getRequirement() )
				{
					sb.append("\t"+rq.getId()+":"+rq.getContents()+"\n");
				}
				
			}
		}
		sb.append("\n");
		for(Field filed : cls.getField())
		{
			makeField(filed, sb ,"\t");
		}

		sb.append("\t\"\"\"\n");
	}
	
	private void makeClassDef(Class cls, StringBuilder sb) 
	{
		String tab="\t";
		cls.setData_base_SrcName(cls.getPackage()+"."+cls.getObjectName());
		sb.append("class "+cls.getObjectName()+": \n");
		makeClassComment(cls, sb);
	
		sb.append("\n");
		makeMethod(cls, sb);
		sb.append("\n");
	}

	private void makeField(Field filed, StringBuilder sb, String tab) 
	{
		//���� �ʱ�ȭ �� ������ �� ����  
		sb.append(tab+"field "+filed.getObjectName()+" : "+filed.getTypeName()+"\n");
	}

	//digram.usecase.test �� ���� ��Ű�� ������ ���� �Ŀ� ó���ؾ���
	private void filePathSet(Class cls) 
	{
		String packageName = cls.getPackage();
		String className = cls.getObjectName();
		
		filePath = new File(codePath+"/"+packageName);
	
		if(!filePath.exists())	//���� ����.
			filePath.mkdir();
		
		filePath = new File(codePath+"/"+packageName+"/"+className+".java");
		
	}
	
	

}