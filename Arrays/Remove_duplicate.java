package Arrays;

public class Remove_duplicate {
    public static void main(String[] args) {
        int arr[] ={1,1,2,3,3,21,21};
    int size=arr.length;

    for(int i=1;i<size;i++){
     if(arr[i-1]==arr[i]){
        for(int j=i;j<size-1;j++){
            arr[j]=arr[j+1];
        }
        size--;
     }
     
    }
    for(int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
