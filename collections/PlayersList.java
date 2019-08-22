package collections;
import java.util.*;
public class PlayersList {
     ArrayList playerArray;
     List subListObj;
     PlayersList(){
    	 playerArray=new ArrayList();
    	 subListObj=new ArrayList();
     }
     void add() {
    	 for(int ctr=0;ctr<5;ctr++){
    		 playerArray.add(new Integer(ctr));
    	 }
    	 playerArray.add("Martina");
    	 playerArray.add("Serena");
    	 playerArray.add("Venus");
    	 playerArray.add("Serena");
    	 System.out.println();
     }
     void display(){
    	 System.out.println("*****************************************"+"********************");
    	 System.out.println("Retrive objects from the ArrayList");
    	 System.out.println("******************************************"+"********************");
    	 System.out.println();
    	 for(int ctr=0;ctr<playerArray.size();ctr++){
    		 System.out.print(" " + playerArray.get(ctr));
    	 }
    	 playerArray.add("Serena");
    	 System.out.println();
     }
     void search() {
    	 System.out.println();
    	 System.out.println("***********************************************"+"***************************");
    	 System.out.println("search for an object and return"+"the first and last position");
    	 System.out.println("**************************************************"+"**************************");
    	 System.out.println();
    	 System.out.println("First occurance of the String"+"\"Serena\" is at position" + playerArray.indexOf("Serena"));
    	 System.out.println("Last occurance of the String"+"\"Serena\" is at position" + playerArray.lastIndexOf("Serena"));
    	 System.out.println();
     }
     void extract() {
    	 System.out.println("***********************************************"+"***************************");
    	 System.out.println("Extract a sublist and"+"then print the new list");
    	 System.out.println("***********************************************"+"***************************");
    	 System.out.println();
    	 subListObj=playerArray.subList(5,playerArray.size());
    	 System.out.println("New Sub-List from index 5 to" + playerArray.size() +" is:" + subListObj);
    	 System.out.println();
    	 }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayersList a=new PlayersList();
		a.add();
		a.display();
		a.search();
		a.extract();

	}

}
