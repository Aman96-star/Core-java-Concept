package COLLECTION_FRAMEWORK;

import java.util.ArrayList;

public class ArrayList_02 {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.add(24);
        list.add(23);
        list.add(22);
        list.add(21);
        Integer arr[] =list.toArray(new Integer[0]);
       //int arr[] ={12,32,3,2,1,3};  //it gives error after instialise no value assign 
arr[0]=30;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " " );
        }
    }
}
