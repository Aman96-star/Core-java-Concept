package Abstraction;

interface Books{
   
    void category();
   
    default void try1(){
        System.out.println("default method ");
    };
    static void try2(){
        System.out.println("static method calls");
    };
}

class Readers implements Books{
   public void category(){
        System.out.println("Sllen loeole");
    }
}

public class Default_static {
    
    public static void main(String[] args) {
       
        
    
    Readers rs =new Readers();
    rs.category();
    rs.try1();
    Books.try2();
    }
}
