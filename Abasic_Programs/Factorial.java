
import java.util.*;
public class Factorial {
    // 5 =5*4*3*2*1 =125
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("input the value ");
        int x =sc.nextInt();
        int count = 1;
        for(int i=x;i>0;i--){
            count =count*i;
        }
        System.out.println(count);
    }

}
