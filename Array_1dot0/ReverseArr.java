package Array_1dot0;

public class ReverseArr {
    public static void main(String[] args) {
        System.out.println("hi Areca");
        // int arr1[] ={2,3,2,4,2,42,2};
        
        // for(int i=arr1.length-1;i>=0;i--){
        //    System.out.println(arr1[i]);
        // }

        // use two pointer concept 
         int arr1[] ={2,3,2,4,2,42,2};

        int left =0;
        int right  =arr1.length-1;

        while(left<right){
            int temp =arr1[left];
            arr1[left] =arr1[right];
            arr1[right] =temp;

            left++;
            right--;
        }

         for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


    }
}
