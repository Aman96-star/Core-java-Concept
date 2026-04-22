package Wrapper_Classes;

public class Wrapper_Class_code {
    public static void main(String[] args) {
        int x =10;
        char ch ='C';

        Integer obj1 =x;

        Character obj2 =ch;

        if(obj1 instanceof Integer){
            System.out.println("yse it is a object ");

        }
        else {
            System.out.println("it is a primitive");
        }
    }    
}
