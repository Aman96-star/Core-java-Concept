package Arrays;
import java.util.*;
// Find Largest Element

public class testpro {
   public static void main(String[] args){
    Scanner og =new Scanner(System.in);
    int x =og.nextInt();
    int arr[] =new int[x];
    for(int i=0;i<arr.length;i++){
        arr[i] =og.nextInt();
    }
        System.out.println();

    // //start  #1
    // int lar=0;
    // for(int i=1;i<arr.length;i++){
    //     if(arr[i]>lar){
    //         lar =arr[i];
    //     }
    // }

    // System.out.println(lar);


    // #3 ------------
    // int first =0;
    // int second =0;
    // int third =0;

    
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]>first){
    //         third =second;
    //        second =first;
    //        first =arr[i];
    //     }
    //     else if(arr[i]>second && arr[i]!=first){
    //         third =second;
    //         second =arr[i];
    //     }
      
    //     else if(arr[i]>third && arr[i]!=first && arr[i]!=second){
    //         third =arr[i];
    //     }
    // }
    // System.out.println(third);
    // System.out.println(second);
    // System.out.println(first);

    // consecutive number
    // int arr1[]={0,1,1,0,1,1,1};
    // int count =0;
    // int max=0;
    // for(int i=0;i<arr1.length;i++){
    //     if(arr1[i]==1){
    //         count++;
            
        
    //     if(count>max){
    //         max=count;
    //     }
    // }
    // else{
    //    count=0;
    // }
    // }
    // System.out.println();
    // System.out.println(max);



















    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }
   } 
}
