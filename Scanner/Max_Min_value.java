package Scanner;
import java.util.*;


public class Max_Min_value {
public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
  
    int max =Integer.MIN_VALUE,min =Integer.MAX_VALUE;

    for(int i=0;i<5;i++){
       int num=  ob.nextInt();
       if(num>max) max=num;
       if(num <min) min=num;

    }
    System.out.println("Max num  "+max);
    System.out.println("Min "+min);
    ob.close();
}    
}
