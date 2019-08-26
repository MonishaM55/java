package com.quinnox.jdbc;
import java.io.*;
public class SerializeDemo {
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.name="Micheal Khan";
		e.address="Castle Street,Bangalore";
		e.SSN=11122333;
		e.number=101;
		try
		{
			FileOutputStream fileOut=new FileOutputStream("d:/temp/employee.sar");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);;
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in d:/temp/employee.sar");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}

}
