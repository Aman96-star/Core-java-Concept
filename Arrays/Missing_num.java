package Arrays;
import java.util.*;

public class Missing_num {
public static void main(String[] args){
    Scanner o = new Scanner(System.in);
    int N =o.nextInt();
    int totalSum =N*(N+1)/2;    //4*5/2=8
    int arrSum=0;
    int arr[] =new int[N];
    for(int i=0;i<arr.length-1;i++){
        arr[i] =o.nextInt();   //1 2 3  , here 4 is missing
        arrSum +=arr[i];
    }
    int missing =totalSum-arrSum;
    System.out.println("this is a missing num : "+missing);
}    
}
