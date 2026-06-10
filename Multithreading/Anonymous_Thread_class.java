package Multithreading;

public class Anonymous_Thread_class {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                System.out.println("hi this is Aman: ---");
            }
        };
        t.start();
    }
}
