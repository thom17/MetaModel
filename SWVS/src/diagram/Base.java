package diagram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class Base {
	String path="";
	String fileName = "script.txt";
	StringBuilder sb;
	public static void main(String test[]) throws IOException
	{
		String target = "result/test.txt";
		String cmd = "java -jar lib/plantuml.jar -tsvg " +'"' +target+'"';
		System.out.println("cmd : "+cmd);
		Process p = Runtime.getRuntime().exec(cmd);

	}
	protected String makeDateFolder(String path) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm");//mm-ss
		String time =  format.format(date);
		String src = path+"/"+time;
		File folder = new File(src);
		folder.mkdir();
		return time;
	}
	
	protected void make()
	{
		String time = makeDateFolder(path);
		String src = path+"/"+time+"/"+fileName;
		try {
			makeFile(sb.toString(), src);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(src+" making");
	}
	
	protected void makeFile(String script, String src) throws IOException
	{
		System.out.println("make File "+src);
		File file = new File(src);
		FileWriter fw = new FileWriter(file, false);
		fw.write(script);
		fw.close();	
		String cmd = "java -jar lib/plantuml.jar -tsvg " +'"' +src+'"';
		System.out.println("cmd : "+cmd);
		Process p = Runtime.getRuntime().exec(cmd);
	}
	public void printSb()
	{
		System.out.println(sb.toString());
	}
	
	protected abstract void draw();
}
