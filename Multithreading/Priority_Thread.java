package Multithreading;

import Multithreading.Runnable_Interface.Mythread;

public class Priority_Thread{
   static class Mythread extends Thread{
    public void run(){
        // System.out.println(getName()+" priority : "+getPriority());
        System.out.println(Thread.currentThread().getPriority());

    }
   } 

    public static void main(String[] args) {
        Mythread t1= new Mythread();
        Mythread t2= new Mythread();
        Mythread t3= new Mythread();

        // t1.setPriority(4);
        // t2.setPriority(2);
        // t3.setPriority(7);
  
        // the default thread is always 5 like static int varaiable =0;

        t1.start();
        t2.start();
        t3.start();
    }
}