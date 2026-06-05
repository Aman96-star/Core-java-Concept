package Multithreading;

public class Runnable_Interface {

    static class Mythread implements Runnable{
        public void run(){
            System.out.println("runnable interface is running.... ");
        }
    }
    public static void main(String[] args) {
        Mythread m =new Mythread();
        m.run();
    }
}
