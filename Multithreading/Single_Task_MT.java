package Multithreading;

import Multithreading.Priority_Thread.Mythread;

public class Single_Task_MT {
   static class Mythread extends Thread{
       public void  Task1(){
            System.out.println("task 1--");
        }
       public void  Task2(){
            System.out.println("task 2--");
        }
       public void  Task3(){
            System.out.println("task 3--");
        }
        public void run(){
            Task1();
            Task2();
            Task3();
        }
    }
    public static void main(String[] args) {
        Mythread t1 =new Mythread();

        t1.start();


    }
}
