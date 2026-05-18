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
