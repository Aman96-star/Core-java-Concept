package Wrapper_Classes;

public class Null_pointer_Exception {
    public static void main(String[] args) {
        // final Float digi =2.2f;   // we can write a final 
        Integer obj =null;
        // unbox the null object
        int x =obj;
        // digi =4.6f;

        System.out.println("unbox value "+x);
        // System.out.println("unbox value "+digi);
    }
    
}
