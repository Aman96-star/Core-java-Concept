package Arrays;
import java.util.*;

public class Left_Rotate_Array {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();   //3
    int  arr[] =new int[n];
    for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();   //4,3,1   -->3,1,4
    }
    System.out.println("here are the solution here ----");
    int temp =arr[0];
    for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
            
        }
        arr[arr.length-1] =temp;
    System.out.println("replace by one ");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
   }
}
