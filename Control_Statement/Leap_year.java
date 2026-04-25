package Control_Statement;
import java.util.*;
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year =sc.nextInt();
        if(year % 400==0){
            System.out.println("yes");
        }
        else if(year % 100==0){
            System.out.println("No");
        }
       else  if(year %4 ==0){
            System.out.println("yes");
        }
        else{
                        System.out.println("No");

        }
    }
}
