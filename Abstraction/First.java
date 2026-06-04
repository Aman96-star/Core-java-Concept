package Abstraction;

//means hiding a mplementation details and show only the essentail feature of user
public class First {
    static abstract class Bike{
        abstract void start();
    }

    static class Dominar extends Bike{
        @Override
        void start() {
            System.out.println("Dominar is a sport bike with 400cc");
        }
    }
    public static void main(String[] args) {
        Dominar dd =new Dominar();
        dd.start();
    }
}
