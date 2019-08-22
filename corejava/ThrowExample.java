package corejava;

public class ThrowExample {
  static void checkEligibility(int stuage,int stuweight){
	  if(stuage<12 && stuweight<40){
		  throw new ArithmeticException("student is not eligible for registration");
	  }
	  else{
		  System.out.println("Student entry is valid");
	  }
  }
  public static void main(String args[]){
	  System.out.println("welcome to the Registration process");
	  checkEligibility(10,39);
	  System.out.println("have a nice day");
  }
}
