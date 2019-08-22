package collections;

import java.util.ArrayList;
import java.util.Collections;
public class MyBasicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("JAVA");
        a1.add("C++");
        a1.add("PERL");
        a1.add("PHP");
        System.out.println(a1);
        System.out.println("Element at index 1:"+a1.get(1));
        System.out.println("Does list contain JAVA?"+a1.contains("JAVA"));
        a1.add(2,"PLAY");
        System.out.println(a1);
        System.out.println("Is arraylist empty?"+a1.isEmpty());
        System.out.println("Index of perl is"+a1.indexOf("PERL"));
        System.out.println("Size of the arraylist is:"+a1.size());
        Collections.sort(a1);
        System.out.println(a1);
        
	}

}
