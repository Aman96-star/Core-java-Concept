package Arrays;

public class Largest_num {
    public static void main(String[] args) {
        int arr[]={40,50,60,10,1};
        // int max=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
            
        // }
        // System.out.println(max);
        int secondmax =0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax =max;
                max =arr[i];
            }
            else if(arr[i] > secondmax && arr[i] != max){
                        secondmax = arr[i];
            }
        }

                System.out.println(secondmax);


    }
}
