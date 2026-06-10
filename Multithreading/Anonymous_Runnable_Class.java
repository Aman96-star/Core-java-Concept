package Multithreading;

public class Anonymous_Runnable_Class {
    public static void main(String[] args) {
        Runnable r =new Runnable(){
            @Override
            public void run(){
                System.out.println("AMAN IS HANDSOME");
            }

        };
        Thread t =new Thread(r);
        t.start();
    }
}
