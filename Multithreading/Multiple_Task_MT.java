package Multithreading;

public class Multiple_Task_MT {

    static class Task1 extends Thread{
       public void run(){
            System.out.println("task 1 is going on ......");
        }
    }

    static class Task2 extends Thread{
        public void run(){
            System.out.println("task 2 is go");
        }
    }
    public static void main(String[] args) {
        Task1 t1 =new Task1();
        Task2 t2 =new Task2();

        t1.start();
        t2.start();
    }
}
