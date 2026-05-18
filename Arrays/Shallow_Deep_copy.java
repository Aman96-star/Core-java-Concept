package Arrays;

import java.util.Arrays;

public class Shallow_Deep_copy {
public static void main(String[] args) {
    int [] arr2={1,4,32,1,2};    
    int arr[] =arr2;
    System.out.println(Arrays.toString(arr));  //here copy refernce only 
    arr[0] =10;
    System.out.println(Arrays.toString(arr));  //here copy refernce only $ and here it effect the other array means point to same array
    int [] copy =Arrays.copyOf(arr2, arr2.length);
    System.out.println(Arrays.toString(copy)); //here deep copy  
            arr2[0] =14;    //see no change means make a seperate copy
        System.out.println(Arrays.toString(copy)); //here deep copy  


}    
}
