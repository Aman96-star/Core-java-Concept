package Arrays;

public class One_Occurance {
    public static void main(String [] args){
        int arr[] ={1,1,1,3,3,1,4,3,2};
        for(int i=0;i<arr.length;i++){
            int count =0;
            //1 1 1 
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count==1){
                System.out.println("the singlr element is "+arr[i]);
            }
        }
    }
}
