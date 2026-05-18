package Arrays;

public class Longest_Sub_Array {
    public static void main(String[] args) {
      int arr[]={1,1,2,1,3,4,2,2};
      int K=4;
      int maxlength =0;

      for(int i=0;i<arr.length;i++){
        int sum =0;
        for(int j=i;j<arr.length;j++){
            sum+=arr[j];

            if(sum==K){ 

                // for(int m=i;m<=j;m++){
                //     System.out.print(arr[m] +" ");
                // }
                // System.out.println();

                int length =j-i+1;

                if(length>maxlength){
                    maxlength=length;
                }
            }
        }
      }
                    System.out.println("Longest Length = " + maxlength);

    }
}

/*
package Arrays;

public class Sub_Array {
    public static void main(String[] args) {
        int arr[] ={1,2,2,3,5,3,2,1};
    int k=6;
    for(int i=0;i<arr.length;i++){   //1
        int sum=0;
        for(int j=i;j<arr.length;j++){ // 1 2 1 3
            sum+=arr[j]; // 3+2+1


            if(sum==k){ //6=6
                System.out.println("the sub array");

                for(int t=i;t<=j;t++){
                    System.out.print(arr[t]+" ");
                }
                System.out.println();
            }
        }
    }

    }
}

*/