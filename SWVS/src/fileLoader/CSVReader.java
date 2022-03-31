package fileLoader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * nxm 의 테이블 형식만 읽을수 있음
 * 매트릭스로
 * @author deemo
 *
 */
public class CSVReader 
{	
	
	 ArrayList<String> datas[] = null;	//[x]<y>
	 ArrayList<String> columName;	//x 축 
	 ArrayList<String> rowName; //y 축 
	 StringBuilder sb;
	 boolean stringMode =false;
	 boolean lineEnd = false;
	public  void main(String args[]) throws IOException
	{
		File file = new File("UCS.csv");
		
		try {
			read(file);
			System.out.println();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(ArrayList<String> list : datas)
			System.out.println(list);
	}
	public CSVReader(String fileName)
	{
		File file = new File(fileName);
		try {
			read(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public CSVReader(File file) {
		try {
			read(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private  boolean isEnd(char c)
	{
		switch(c)
		{
		case '\n':
			if(!stringMode)
				return true;
		case ',':
			if(!stringMode)
				return true;
			else
				return false;
		case '"':
			stringMode =!stringMode;
			default :
				return false;
		}
	}
	/**
	 * colum 설정 (데이터 값 이름 == x축 가로 이름 )
	 * @param line : csv 맨 윗줄 
	 */
	private  void setColumName(FileReader reader)
	{
		columName = new ArrayList<String>();
		int c = -1;
		try 
		{
			do 
			{
				c = reader.read();
				if( isEnd((char)c) )
				{
					columName.add(sb.toString());
					sb.setLength(0);	
					if((char)c == '\n')
						initDatas();
					
				}else
					sb.append((char)c);
			}while( 0 < c  && datas == null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	private  void initDatas() 
	{
		datas = new ArrayList[columName.size()];
		// TODO Auto-generated method stub
		for(int i=0; i<columName.size(); i++)
		{
			datas[i] = new ArrayList<String>();
			datas[i].add(columName.get(i));
		}
	}
	public  void read(File file) throws FileNotFoundException, IOException
	{
		FileReader reader = new FileReader(file);
		sb = new StringBuilder();
		setColumName(reader);
		rowName = new ArrayList<String>();
		rowName.add(columName.get(0));
		int index=0;
		int c = reader.read();
		while( 0 < c) 
		{
			if(isEnd((char)c))
			{
				datas[index].add(sb.toString());
				if(index == 0)
					rowName.add(sb.toString());
				sb.setLength(0);
				index = (index+1)%datas.length;
			}
			else
				sb.append((char)c);
			c = reader.read();
		}
	}
	public  ArrayList<String>[] getDatas() {
		return datas;
	}

	public  ArrayList<String> getColumName() {
		return columName;
	}

	public  ArrayList<String> getRowName() {
		return rowName;
	}
}