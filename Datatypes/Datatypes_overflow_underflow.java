import java.util.Arrays;
public class Datatypes_overflow_underflow {
 

    public static void main(String[] args) {
      
        // Overflow = value goes ABOVE maximum limit
     byte b =127;
     b++;
     System.out.println(b);   //-128
      // Underflow = value goes BELOW minimum limit
     byte a =-128;
     a--;
     System.out.println(a);  //127
        
        
    }
}
