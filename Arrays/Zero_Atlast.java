package Arrays;

public class Zero_Atlast {
   public static void main(String[] args) {
     int arr[]={1,2,3,4,5,0,43,0,2};
     int index =0;
    for(int i=0;i<arr.length;i++){   //1 2--
            if(arr[i]!=0){
                arr[index] =arr[i];
                index++;
            }
        }

// here i shift the zero to last 
    while(index<arr.length){
        arr[index] =0;
        index++;
    }

    for(int i=0;i<arr.length;i++){
        System.out.println("print the array - : "+arr[i]);

    }
    
   }
}


