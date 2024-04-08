package com.hackathon.prgms;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Q31Readwrite {

	public static void main(String[] args) throws IOException 
	{
		String userdir=System.getProperty("user.dir");
		//System.out.println(userdir);
		String fileseparator=System.getProperty("file.separator");
		//C:\workspace\Javahackathon\Readfile\readwrite
		String filepath=userdir+fileseparator+"Readfile"+fileseparator+"readwrite";
        FileReader filereader=new FileReader(filepath);
        BufferedReader bufferedreader=new BufferedReader(filereader);
        System.out.println(bufferedreader.readLine());
        System.out.println(bufferedreader.readLine());
        System.out.println(bufferedreader.readLine());
        System.out.println(bufferedreader.readLine());
        
        String str;
		 while((str=bufferedreader.readLine())!=null)
		 {
			 System.out.println(str);
		 }
		bufferedreader.close();
		
		Properties property=new Properties();
		property.setProperty("ddd", "12");
		FileOutputStream fo=new FileOutputStream(filepath);
		property.store(fo, "new value");
	}

}
