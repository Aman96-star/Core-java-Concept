package Multithreading;

import Multithreading.Priority_Thread.Mythread;

public class Thread_Values {

    static class Mythread extends Thread{
        public void run(){
            System.out.println(" hi "+getName());
        }
    }
    public static void main(String[] args) {

        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

        Mythread t1 =new Mythread();

        t1.setName("AMAN Verma");

        t1.start();
    }
}
