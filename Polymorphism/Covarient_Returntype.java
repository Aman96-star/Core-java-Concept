package Polymorphism;

public class Covarient_Returntype {
    public static class bike{
        bike speed(){
            System.out.println("parent return type");
            return new bike();
        }
    }

     public static class Ns extends bike{
        @Override
        Ns speed(){
            return new Ns();
        }
    }

    public static void main(String[] args) {
                    System.out.println("child  type");

        Ns  n = new Ns();
    n.speed();
    }
}
