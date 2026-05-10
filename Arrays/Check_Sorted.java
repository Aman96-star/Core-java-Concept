package Arrays;

public class Check_Sorted {
   public static void main(String[] args) {
     int arr[] ={1,2,2,3,4};
    boolean check =true ;
   
    for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            check=false;
            break;
        }

   }
   System.out.println(check);
    }
}
