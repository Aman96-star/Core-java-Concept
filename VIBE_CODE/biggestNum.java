package VIBE_CODE;
import java.util.*;

public class biggestNum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();   //1 2 6 8 1
        }
        System.out.println("Solution----------------");
        System.out.println(firstBiggest(arr));
    }

    public static int  firstBiggest(int arr1[]){
            int max=0;
            int s =0;
            int t=0;
            // System.out.println("s");
            for(int i=0;i<arr1.length;i++){
                // if(arr1[i]>max){
                //      s=max;
                //      max=arr1[i]; 
                // }
                
                if(arr1[i]>max){
                   

                }

            }
            return t;
    }
}

