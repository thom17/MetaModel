package main;

import java.io.File;
import java.io.IOException;

import codeGenerater.JavaCodeGenerater;
import diagram.ClassDg;
import diagram.SequenceDg;
import diagram.UsecaseDg;
import fileLoader.RqSpecific;
import fileLoader.UcSpecific;
import xmiManage.ClassDgAutoMaker;
import xmiManage.ModelManager;
import xmiManage.RqManager;
import xmiManage.UsecaseManager;

public class Test 
{
	final static String M_FILE = "test.swvs";
	final static String RQ_FILE = "rqTable.csv";
	final static String UC_DIR = "target";
	static ModelManager mmg;
	public static void main(String argsp[])
	{
		oneWay();
	}
	
	public static void readRqFile(String rqFile)
	{
		RqSpecific rqs = new RqSpecific(new File(rqFile));
		RqManager rqm = new RqManager(mmg, rqs);
		System.out.println("RQTable done");
	}
	
	public static void readUseCaseSpec(String target)
	{
		File file = new File(target);
		if( file.isDirectory() )
		{
			for(File f : file.listFiles())
			{
				readUseCaseSpec(f.getPath());
			}
		}else
		{
			UcSpecific ucs = new UcSpecific(file);
			UsecaseManager ucm = new UsecaseManager(mmg, ucs);
			System.out.println(file.getAbsolutePath() +" UseCase Spec done");
		}
	}
	public static void graphMake()
	{
		try {
			ClassDg.main(mmg.project);
			SequenceDg.main(mmg.project);
			UsecaseDg.main(mmg.project);
			System.out.println("Grpah Make done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void codeMaker()
	{
		JavaCodeGenerater maker = new JavaCodeGenerater(mmg.project);	
		maker.make();
		System.out.println("Code Generator done");
		
	}
	/**UseCase ����, �䱸���� ���̺� �Է��Ͽ� ClassDg UML ����
	 * ���̵� �ڵ� �ڵ� ����
	 * 
	 */
	public static void oneWay()
	{
		mmg = new ModelManager(M_FILE);
		readRqFile(RQ_FILE);
		readUseCaseSpec(UC_DIR);
		new ClassDgAutoMaker(mmg);	//Class Diagram �ڵ� ����
		graphMake();
		codeMaker();
		System.out.println("oneWay done");
		
		
	}
}
