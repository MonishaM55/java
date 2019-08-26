package com.quinnox.threading;

public class MyThread extends Thread{

	public static void main(String[] args) {
	   MyThread t=new MyThread();
	   t.create();
	   System.out.println("Main Thread");

	}
   public void create()
   
   {
	   Thread o=new Thread(this);
	   o.start();
   }
   public void run()
   {
	   while(true){
		   try
		   {
			   System.out.println("child thread");
			   Thread.sleep(500);
		   }
		   catch(InterruptedException e)
		   {
			   
		   }
	   }
   }
}
