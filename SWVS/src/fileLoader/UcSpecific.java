package fileLoader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UcSpecific 
{
	CSVReader csv;
	String sysName;
	String sysId;
	String ucName;
	String ucId;
	String desc;
	String useActor[];
	String ucPreCond;
	String ucAftCond;
	String relatedRq;
	
	Map<String, EventFlow> flowMap = new HashMap<String,EventFlow>();
	
	public static void main(String args[])
	{
		UcSpecific uc = new UcSpecific(new File("UCS.csv"));
		System.out.println("main End");
	}
	public UcSpecific(File file)
	{
		csv = new CSVReader(file);
		read();
	}
	public void read()
	{
		ArrayList<String>[] datas = csv.getDatas();
		ArrayList<String> rowName = csv.getRowName();
		ArrayList<String> colName = csv.getColumName();
		for(int y=1; y<rowName.size(); y++)
		{
			String type = datas[0].get(y);
			if(type.equals("Use case Name"))
				ucName = datas[1].get(y);
			else if(type.equals("System"))
				sysName = datas[1].get(y);
			else if(type.equals("System Id"))
					sysId = datas[1].get(y);
			else if(type.equals("UC Id"))
				ucId = datas[1].get(y);
			else if(type.equals("desc"))
				desc = datas[1].get(y);
			else if(type.equals("Pre-Condition"))
				ucPreCond = datas[1].get(y);
			else if(type.equals("Post-Condition"))
				ucAftCond = datas[1].get(y);
			else if(type.equals("Use Actor"))
				useActor=makeActorList(datas[1].get(y));
			else if(type.equals("Related Rq"))
				relatedRq = datas[1].get(y);
			else if(type.equals("Usecase Specific"))
				continue;
			else if(type.equals(""))
				continue;
			else if(type.equals("Scenario"))
				continue;
			else if(type.equals("Sequence Name"))
				continue;
			else
				makeEventFlow(y, datas);
			
			/*
			 "Use case Name":
				System.out.print("1");
				break;
			case "desc":
				System.out.println("@");
			
			default:
				System.out.println(type);
			*/	
			}
		}
	
	public String getUcName() {
		return ucName;
	}
	public String getUcId() {
		return ucId;
	}
	public String getDesc() {
		return desc;
	}
	public String[] getUseActor() {
		return useActor;
	}
	public String getUcPreCond() {
		return ucPreCond;
	}
	public String getUcAftCond() {
		return ucAftCond;
	}
	public String getSysName()
	{
		return sysName;
	}
	public String getSysId()
	{
		return sysId;
	}
	public Map<String, EventFlow> getFlowMap() {
		return flowMap;
	}
	private String[] makeActorList(String data) 
	{
		// TODO Auto-generated method stub
		if(data == null || data.length() == 0)
			return null;
		else 
		{
			String str = data.replace("\"", "").replace(",", ", ");
			return str.split(", ");	
		}
	}
	private String getFlowId(String number)
	{
		String id = ucId+"-FL";
		//if(!number.contains("."))
		//	return id+number;
		String list[] = number.split("[.]");
		for(String n : list)
		{
			id+="-"+n;
		}
		return id;
	}
	private void makeEventFlow(int y, ArrayList<String>[] datas) 
	{
		EventFlow flow = new EventFlow();
		flow.name = datas[0].get(y);
		String str = datas[1].get(y).replace("\"", "");
		
		Pattern pt = Pattern.compile("[0-9.]+[.]");
		Matcher mt = pt.matcher(str);
		if(mt.find())
		{
			int end = mt.end();
			int st = mt.start();
			flow.context = str.substring(end, str.length());
			flow.number = str.substring(0,end-1);
			flow.id = getFlowId(flow.number);
			flowMap.put(flow.number, flow);
			if(flow.number.contains("."))
			{
				int last = flow.number.lastIndexOf(".");
				String index = flow.number.substring(0, last);
				EventFlow superFlow = flowMap.get(index);
				superFlow.alterEvent.add(flow);
			}
			flow.preCond = datas[2].get(y);
			flow.aftCond = datas[3].get(y);
			flow.hostList = makeActorList(datas[4].get(y));
			flow.clientList = makeActorList(datas[4].get(y));
		}		
	}
}