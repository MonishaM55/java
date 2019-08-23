package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student22 implements Comparable<Student22>
{
	int rollno;
	String name;
	int age;
	Student22(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student22 st)
	{
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}
public class TestSort{
	public static void main(String args[])
	{
		ArrayList<Student22> a1=new ArrayList<Student22>();
		a1.add(new Student22(1,"john",29));
		a1.add(new Student22(2,"mark",21));
		a1.add(new Student22(3,"den",26));
		Collections.sort(a1);
		for(Student22 st:a1){
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
	}
}