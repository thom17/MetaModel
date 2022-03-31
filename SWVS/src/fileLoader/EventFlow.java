package fileLoader;

import java.util.ArrayList;

public class EventFlow
{
	public String id;
	public String number;
	public String context;
	public String preCond;
	public String aftCond;
	public String name;
	public String clientList[];
	public String hostList[];
	public ArrayList<EventFlow> alterEvent = new ArrayList<EventFlow>();	
}