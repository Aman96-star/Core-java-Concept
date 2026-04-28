
package Control_Statement;
import java.util.*;

public class Prime_number{
    // 1,2,3,5---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n<0){
            System.out.println("error please write a valid input");
        }

        else if(n%2==0){
            System.out.println("yes");
        }

        else{
            System.out.println("no");
        }
    }
}