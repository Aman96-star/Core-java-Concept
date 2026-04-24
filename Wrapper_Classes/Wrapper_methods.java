package Wrapper_Classes;

public class Wrapper_methods {
    // Integer.parsevalue()   -->This method converts a String into a primitive int.
    //Integer.valueOf()  -->This method converts a String into an Integer Object (a Wrapper Class).

   public static void main(String[] args) {
     String num ="1234";
    // int a =Integer.parseInt(num);
    int b =Integer.valueOf(num);

    // System.out.println("use of parseInt method : "+a);
    System.out.println("use of valueof method : "+b);

   }


}
