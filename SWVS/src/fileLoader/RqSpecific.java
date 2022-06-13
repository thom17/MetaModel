package fileLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * RqTable의 정보 객체<br>
 * 정해져 있는 양식의 파일을 읽어야 함.<br>
 * 
 * @author thom1
 *
 */
public class RqSpecific {
  CSVReader csv;
  final int ID = 0;
  final int DESC = 1;
  final int NAME = 2;
  final int TYPE = 3;
  final int DEPERTMENT = 4;
  final int FILEPATH = 5;

  Map<String, Req> rqMap = new LinkedHashMap<String, Req>();

  public static void main(String args[]) {
    RqSpecific rq = new RqSpecific(new File("RqTable.csv"));
    rq.print();
    System.out.println("main End");
  }

  public RqSpecific(File file) {
    csv = new CSVReader(file);
    read();
  }

  public void print() {
    for (String key : rqMap.keySet()) {
      Req req = rqMap.get(key);
      System.out.println(key + " : " + req.desc + ", " + req.type);

    }
  }

  public void read() {
    ArrayList<String>[] datas = csv.getDatas();
    for (int y = 1; y < datas[ID].size(); y++) {
      Req req = new Req();
      req.id = datas[ID].get(y);
      req.rqName = datas[NAME].get(y);
      req.type = datas[TYPE].get(y);
      req.filePath = datas[FILEPATH].get(y);
      req.desc = datas[DESC].get(y);
      rqMap.put(req.id, req);
    }
  }

  public Map<String, Req> getReqMap() {
    return rqMap;
  }

}
