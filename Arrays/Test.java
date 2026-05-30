package Arrays;

public class Test {
    public static void main(String[] args) {
       int arr[] ={1,2,1,6};
       int target =3;
      for(int j=0;j<target;j++){
         int temp =arr[0];
      for(int i=0;i<arr.length-1;i++){
          arr[i]=arr[i+1];
       }
       arr[arr.length-1] =temp;
      }
       for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]+" ");
       }
    }

}
