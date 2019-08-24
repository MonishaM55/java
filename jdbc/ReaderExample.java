package com.quinnox.jdbc;
import java.io.*;
public class ReaderExample {
  public static void main(String args[]){
	  try{
		  Reader r=new FileReader("d:/temp/data.txt");
		  int data=r.read();
		  while(data !=-1){
			  System.out.println((char)data);
			  data=r.read();
		  }
		  r.close();
	  }
	  catch(Exception e){
		  System.out.println(e.getMessage());
	  }
  }
}
