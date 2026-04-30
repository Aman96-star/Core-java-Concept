package Scanner;
import java.util.*;
// Sum of N numbers
public class N_numbers {
   public static void main(String[] args) {
     Scanner ob =new Scanner(System.in);
    int n =ob.nextInt();
    int sum =0 ; 
    for(int i=0;i<n;i++){
        
        sum+=ob.nextInt();
    }
    System.out.println(sum);
    ob.close();
   }
}
