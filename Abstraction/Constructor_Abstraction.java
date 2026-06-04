package Abstraction;

public class Constructor_Abstraction {
   static abstract class bike{
        bike(){
            System.out.println("constructor called");
        };
        abstract void start();

    }

    static class Ns extends bike{
        void start(){
            System.out.println("child class run");
        }
    }
    public static void main(String[] args) {
        // bike b =new bike();   // abstract cannot call constructor
        Ns n = new Ns();
        n.start();
    }
}
