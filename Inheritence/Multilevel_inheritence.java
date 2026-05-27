
package Inheritence;

public class Multilevel_inheritence {
    
    public static class Eletronics{
            void desc(){
                System.out.println("hi this is a desc of Eletronics ITEMS");
            }
    }
    public static class Laptop extends Eletronics{
        void desc1(){
                System.out.println("hi this is a desc of  Laptop items");
            }
    }
    public static class Mac extends Laptop{
        void desc2(){
                System.out.println("hi this is a desc of Mac by Apple");
            }
    }
    
    
    public static void main(String[] args) {
        Mac app =new Mac();
        app.desc();
        app.desc2();
        app.desc1();
    }
}
