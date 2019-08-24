package com.quinnox.jdbc;
import java.io.IOException;
import java.io.*;
public class WriterExample {
	public static void main(String args[])
	{
		try{
			Writer w=new FileWriter("d:/temp/data.txt");
			String content="she sells sea shells on the sea shore";
			w.write(content);
			w.close();
			System.out.println("data written");
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
