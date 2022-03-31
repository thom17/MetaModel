package diagram;

import java.io.IOException;

import SWVS.Class;
import SWVS.Field;
import SWVS.Function;
import SWVS.Method;
import SWVS.Project;
import SWVS.Object;

public class ClassDg extends Base
{
	Project project;
	public ClassDg(Project project)
	{
		this.project = project;
		this.fileName = project.getProjectName()+"_ClassDiagram";
		this.sb = new StringBuilder();
		this.path = "model";		
	}
	@Override
	protected void draw() {
		sb.append("@startuml\n");
		for(Class cls :project.getClass_())
		{
			drawClass(cls);
		}
		sb.append("@enduml\n");
	}
	public static ClassDg main(Project project) throws IOException
	{
		ClassDg dg = new ClassDg(project);
		dg.draw();
		dg.make();
		return dg;
	}
	
	private void drawClass(Class cls) 
	{
		String className = cls.getObjectName();
		String color = " ";
		if(cls.isAddedObject())
			color += "#pink";
		sb.append("class "+className+color+"\n{\n");
		for(Field filed : cls.getField())
		{
			drawFiled(filed);
		}
		sb.append("\n");
		for(Method fun : cls.getMethod())
		{
			drawMethod(fun);
		}
		sb.append("\n}\n");
		for(Class has : cls.getHasClass())
		{
			sb.append(" "+className +" *-- "+has.getObjectName()+"\n");
		}
		sb.append("\n");
	}
	private void drawMethod(Object object) 
	{
		String color = "";
		if(object.isAddedObject())
			color += "<color:red>";
		String info =color + object.getObjectName();
		sb.append("\t"+info+"\n");
	}
	private void drawFiled(Field filed) 
	{
		String color = " ";
		if(filed.isAddedObject())
			color += "<color:red>";
		String info = color+filed.getTypeName()+" "+filed.getObjectName();
		if(!filed.isIsClass())
			sb.append("\t"+info+"\n");
	}
	
	
}
