package Inheritence;

public class Constructor_Chaining {
    public static class Bikes{
         Bikes(){
            System.out.println("Best Performance Engine bikes");
        }
    }

    public static class Triumph_speedy extends Bikes{
         Triumph_speedy(){
            super();
            System.out.println("Triumph_speedy triple x Engine bikes");
        }
    }

    public static void main(String[] args) {
        Triumph_speedy ts =new Triumph_speedy();
       
    }
}
