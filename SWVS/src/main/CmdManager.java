package main;

import java.io.IOException;
import SWVS.Project;
import xmiManage.ModelManager;
import xmiManage.XmiReader;

enum Type {
  make, select, add, none;

  public Type strParse(String src) {
    src = src.toLowerCase();
    if (src.equals("make")) {
      return Type.make;
    } else if (src.equals("select")) {
      return Type.select;
    } else if (src.equals("add")) {
      return Type.add;
    } else
      return Type.none;
  }
}


public class CmdManager {
  static String filePath;
  static Type type;
  static XmiReader xmiReader;
  static Project project;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    if (args.length < 1) {
      try {
        ModelManager.main(args);
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    } else {
      argumentParsing(args);
    }
  }

  // "test.swvs" add UC01_FL02
  private static void argumentParsing(String[] args) {
    filePath = args[0];
    String typeSrc = args[1];
    type = Type.valueOf(args[0]);
    if (type == Type.make) {
      // makeFile(args);
    } else {
      xmiReader = new XmiReader(filePath);
      project = (Project) xmiReader.getRoot();
    }

  }

  private static void makeFile(String args) {
    // TODO Auto-generated method stub

  }



}
