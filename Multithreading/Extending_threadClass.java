package Multithreading;

public class Extending_threadClass {

    static class try1 extends Thread{
        public void run(){
            System.out.println("thread is running ");
        }
    }
    public static void main(String[] args) {
        try1 t =new try1();
        t.run();
    }
}
