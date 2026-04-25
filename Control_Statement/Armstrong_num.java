package Control_Statement;
import java.util.*;
public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("writ ethe num: ");
        //245 =
        int n=245;
        
        int original =n;
        int sum =0;

    while(n>0){
       int digit= n%10;
        sum +=digit*digit*digit;
        n=n/10;

    }
    if(sum==original){
        System.out.println("yes armstrong");
    }
    else{
                System.out.println("No");

    }

    }
}
