package Array_1dot0;
import java.util.*;

public class Max_Min_value {
    public static void main(String[] args) {
        // Scanner o =new Scanner(System.in); 
        int arr1[] ={2,9,3,5,3,2};
        // int max=0;
        // int min=0;
        // Arrays.sort(arr1);
        // min =arr1[0];
        // max =arr1[arr1.length-1];
        // System.out.println("min is :"+min+ "\nmax :"+max);
        int min =arr1[0];
        int max =arr1[0];

        for(int i=1;i<arr1.length;i++){
            if(arr1[i]<min){   //9<2-->9,3<9-->3,2<3-->2
                min= arr1[i];
            }
            
            if(arr1[i]>max){
                max=arr1[i];
            }

        }
        System.out.println("this is a  max value : "+max);
        System.out.println("----------this is a  mini value : "+min);
    }
}
