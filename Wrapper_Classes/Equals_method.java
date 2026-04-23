package Wrapper_Classes;

public class Equals_method{

    public static void main(String[] args){
        
        Integer a=200;
        Integer b=200;

        System.out.println(a ==b);
        //: Always use .equals() to compare wrapper objects safely. Never rely on == for wrappers
        //Java caches Integer values from -128 to 127. For these values, == works.
        System.out.println(a.equals(b));
    }


}