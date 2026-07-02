package A_NamasteDSA;
import java.util.*;

public class Practise_4Q {
    public static void main(String[] args) {
        Scanner o =new Scanner(System.in);
        int N =o.nextInt();

        int arr[] =new int[N];

        for(int i=0;i<arr.length;i++){
            arr[i]=o.nextInt();
        }
        // -------------------------------------------
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){ //2>1
                max =arr[i];
            }

        }
        System.out.println("heeeeeee this is a max one : "+max);
    }
}
