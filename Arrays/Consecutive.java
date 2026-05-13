package Arrays;

public class Consecutive {
   public static void main(String[] args){
     int arr[] ={1,2,1,1,0,7,0};
    int c_num=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]==arr[i]){
                c_num++;
            }
        }
    }
    System.out.println("this is co number : "+c_num);
   }
}
