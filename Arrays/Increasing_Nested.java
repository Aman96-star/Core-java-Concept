package Arrays;

public class Increasing_Nested {
    public static void main(String[] args) {
        int arr [] ={1,2,32,1};
        for(int i=0;i<arr.length;i++)
        {
            int temp =0;
            for(int j=i+1;j<arr.length;j++){
                // if(arr[i]>arr[j]){    // increasing order
                //     temp =arr[i];
                //     arr[i]=arr[j];
                //     arr[j] =temp;
                // }
                if(arr[i]<arr[j]){     // decreasing order
                     temp =arr[i];
                    arr[i]=arr[j];
                    arr[j] =temp;
                }
            }

            System.out.println(arr[i]+" ");
        }
    }
}
