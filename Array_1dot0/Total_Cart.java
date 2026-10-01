package Array_1dot0;
import java.util.*;

public class Total_Cart {
    public static void main(String [] args){
        Scanner o = new Scanner(System.in);
        int N =o.nextInt();
        int arr1[] =new int[N];
        int TotalItem=0;

        System.out.println("Input the values : ");
        for(int i=0;i<arr1.length;i++){
          arr1[i] =o.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
          TotalItem+=arr1[i]; 

        }

        System.out.println("this is  Total Sum : "+TotalItem);


    }
}
