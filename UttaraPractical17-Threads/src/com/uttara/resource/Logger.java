package com.uttara.resource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {

	private String path="/Users/vikramshastry/Desktop/log.txt";
	private boolean devMode = true;
	
	public void log(String data)
	{
		BufferedWriter bw = null;
		try
		{
			bw = new BufferedWriter(new FileWriter(path,true));
			Date dt = new Date();
			bw.write(dt.toString()+":"+data);
			bw.newLine();
			if(devMode)
				System.out.println(data);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(bw!=null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
	}
	private Logger()
	{
		System.out.println("in Logger() no-arg constr");
	}
	private static Logger obj = null;
	
	public static Logger getInstance()
	{
		System.out.println("in Logger getInstance(), obj = "+obj);
		if(obj == null)
			obj = new Logger();
		
		return obj;
	}
	
}
