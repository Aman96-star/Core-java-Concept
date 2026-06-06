package Arrays;

public class test4 {
    public static void main(String[] args) {
        int arr []={1,2,3,2,1,2};
        int target =6;
       
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    // sub array: 
                    for(int k =i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();

                }
            }
        }
    }
}
