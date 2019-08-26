package com.quinnox.threading;
class Mythread3 extends Thread{
public void run(){
for(int i=0; i<10; i++){
System.out.println("Child Thread");
}
}}
class Mainthread3{
public static void main(String args[ ]){
Mythread3 mt = new Mythread3(); /* main thread created the child thread*/
mt.start();
for(int i=0; i<10; i++){
System.out.print("Main Thread");
}
}}

