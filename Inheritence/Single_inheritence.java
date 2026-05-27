package Inheritence;

public class Single_inheritence {
    public static class Food  {
        void desc(){
            System.out.println("Normal food ");
        }
        
    }
    public static class Spicy extends Food  {
        void desc1(){
            System.out.println("Spicy food ");
        }
        
    }
  
    
    public static void main(String[] args) {
       Spicy sp =new Spicy();
       sp.desc();
       sp.desc1();
    }
}
