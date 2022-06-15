package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import codeGenerater.JavaCodeGenerater;
import codeGenerater.PythonCodeGenerater;
import diagram.ClassDg;
import diagram.SequenceDg;
import diagram.UsecaseDg;
import fileLoader.RqSpecific;
import fileLoader.UcSpecific;
import xmiManage.ClassAutoMaker;
import xmiManage.ModelManager;
import xmiManage.RQTracer;
import xmiManage.RqManager;
import xmiManage.UsecaseManager;

public class Test {
  final static String M_FILE = "test.swvs";
  final static String RQ_FILE =
      "C:\\Users\\thom1\\Desktop\\jsj\\python\\AutoGentProject\\result\\0615\\rqTable.csv";
  final static String UC_DIR =
      "C:\\Users\\thom1\\Desktop\\jsj\\python\\AutoGentProject\\result\\0615\\uc";
  static ModelManager mmg;

  public static void main(String argsp[]) {
    mmg = new ModelManager(init("test.swvs"));
    // makeCode();
    readRqFile("rqTable.csv");
    readUseCaseSpec("Sys11-UC-1.csv");
    new ClassAutoMaker(mmg).autoMake();
    RQTracer.projectTrace(mmg.project);
    mmg.save();

    codeMaker();
    mmg.save();
    System.out.println("Test Main End");
    // oneWay();
  }

  private static String init(String fileName) {
    File file = new File(fileName);
    FileWriter fw;
    try {
      fw = new FileWriter(file);
      PrintWriter pw = new PrintWriter(fw);
      pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      pw.println(
          "<sWVS:Project xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:sWVS=\"http://www.example.org/sWVS\" projectName=\"test\">");
      pw.println("</sWVS:Project>");
      pw.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return fileName;
  }


  private static void makeCode() {
    // TODO Auto-generated method stub
    mmg = new ModelManager(M_FILE);
    codeMaker();

  }

  public static void readRqFile(String rqFile) {
    RqSpecific rqs = new RqSpecific(new File(rqFile));
    RqManager rqm = new RqManager(mmg);
    rqm.addRq(rqs);
    mmg.save();
    System.out.println("RQTable done");
  }

  public static void readUseCaseSpec(String target) {
    File file = new File(target);
    if (file.isDirectory()) {
      for (File f : file.listFiles()) {
        readUseCaseSpec(f.getPath());
      }
    } else {
      UcSpecific ucs = new UcSpecific(file);
      UsecaseManager ucm = new UsecaseManager(mmg);
      ucm.addUcSpecific(ucs);
      System.out.println(file.getAbsolutePath() + " UseCase Spec done");
    }
    mmg.save();
  }

  public static void graphMake() {
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

  public static void codeMaker() {
    JavaCodeGenerater maker = new JavaCodeGenerater(mmg.project);
    maker.make();
    System.out.println("Java Code Generator done");

    PythonCodeGenerater pythonMaker = new PythonCodeGenerater(mmg.project);
    pythonMaker.make();
    System.out.println("Python Code Generator done");

  }

  /**
   * 
   * 초기화, UseCase 명세서, 요구사항 테이블 입력하여 ClassDg UML 생성 가이드 코드 자동 생성
   * 
   */
  public static void oneWay() {
    init(M_FILE);
    mmg = new ModelManager(M_FILE);
    readRqFile(RQ_FILE);
    readUseCaseSpec(UC_DIR);
    new ClassAutoMaker(mmg).autoMake(); // Class Diagram 자동 생성
    RQTracer.projectTrace(mmg.project);
    mmg.save();
    // graphMake();
    // codeMaker();
    // mmg.save();
    System.out.println("oneWay done");


  }
}
