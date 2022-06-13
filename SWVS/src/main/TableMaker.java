package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import SWVS.Class;
import SWVS.Flow;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.System;
import SWVS.UseCase;
import xmiManage.XmiReader;

public class TableMaker {
  XmiReader reader;
  EList<System> systemList;
  EList<Requirement> rqList;
  EList<Flow> eventFlList;
  ArrayList<UseCase> ucList = new ArrayList<UseCase>();

  StringBuilder sb = new StringBuilder();
  Map<Requirement, ArrayList<UseCase>> rq_uc = new HashMap<Requirement, ArrayList<UseCase>>();
  Map<UseCase, ArrayList<Flow>> uc_fl = new HashMap<UseCase, ArrayList<Flow>>();

  private void makeFile() {
    File file = new File("Trace-Table.csv");
    FileWriter writer;
    try {
      writer = new FileWriter(file);
      writer.write(sb.toString());
      writer.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public TableMaker(XmiReader reader) {
    this.reader = reader;
    Project project = (Project) reader.getRoot();

    makeRq(project.getRequirement());
    makeUc(project.getSystem());
    // makeRqUc();
    makeSysCls();
    makeFile();

  }

  private void makeSysCls() {
    EList<Class> list = ((Project) reader.getRoot()).getClass_();
    sb.append("\nSys-Cls, ");
    for (System s : systemList) {
      sb.append("\t" + s.getId() + ",");
    }
    sb.append("\n");
    for (Class cls : list) {
      sb.append(cls.getPackage() + "." + cls.getObjectName() + ", ");
      for (int i = 0; i < systemList.size(); i++) {
        if (systemList.get(i).getId().equals(cls.getId()))
          sb.append("   V,");
        else
          sb.append(", ");
      }
      sb.append("\n");
    }
  }

  /*
   * private void makeRqUc() { sb.append("RQ-UC, "); Map<Requirement, EList<UseCase>> table = new
   * HashMap<Requirement, EList<UseCase>>(); for(Requirement q : rqList ) { table.put(q, q.get); }
   * 
   * for(UseCase uc : ucList) { sb.append(uc.getId()+","); } sb.append("\n"); for(Requirement q :
   * rqList) { int pos = 0; sb.append(q.getReqId()+", "); for(int i=0; i<ucList.size(); i++) {
   * if(pos == q.getUsecase().size()) sb.append(", "); else if(ucList.get(i) ==
   * q.getUsecase().get(pos)) { sb.append("   V"+", "); pos++; } else sb.append(", "); }
   * sb.append("\n"); } sb.append("\n");
   * 
   * 
   * }
   */
  /*
   * private void makeRqUc() { table = new HashMap<EObject, ArrayList<EObject>>(); for(Requirement q
   * : rqList ) { table.put(q, new ArrayList<EObject>()); } for(UseCase uc : ucList) {
   * sb.append(uc.getId()+","); EList<Requirement> rqList= uc.getRequirement(); for(Requirement rq :
   * rqList) { ArrayList<EObject> refList = table.get(rq); refList.add(uc); } //table.put(, null); }
   * sb.append("\n"); for(EObject key : table.keySet()) { Requirement rq = (Requirement)key;
   * sb.append(rq.getReqId()+", "); ArrayList<EObject> checkList = table.get(rq); int pos = 0;
   * for(int i=0; i<this.ucList.size(); i++) { if(checkList.get(pos) != this.ucList.get(i))
   * sb.append(" ,"); else { UseCase uc = (UseCase) checkList.get(pos++);
   * sb.append(uc.getId()+", "); } } sb.append("\n"); } }
   */
  private void makeUc(EList<System> system) {
    systemList = system;
    for (System s : system) {
      for (UseCase uc : s.getUsecase()) {
        ucList.add(uc);
        for (UseCase exUc : uc.getExtend())
          ucList.add(exUc);
        for (UseCase inUc : uc.getInclude())
          ucList.add(inUc);
      }
    }
  }

  private void makeRq(EList<Requirement> rqList) {
    this.rqList = rqList;
  }

  public static void main(String args[]) {
    XmiReader xmi = new XmiReader("Wpm.swvs");
    new TableMaker(xmi);
  }

}
