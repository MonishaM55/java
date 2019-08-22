package corejava;
import java.io.*;
public class ThrowsFile {
	public static void main(String args[])throws IOException{
		FileWriter file=new FileWriter("c:\\Data1.txt");
		file.write("java 9");
		file.close();
	}

}
