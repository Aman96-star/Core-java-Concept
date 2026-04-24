package Wrapper_Classes;

public class Autoboxing_method {
   
    static int Car(Integer num){
        return num;
    }
    
    public static void main(String[] args) {
       Integer num =4223;
      int result = Car(num);
      System.out.println("this is a wrapper autobixing: "+result); 
    }
}
