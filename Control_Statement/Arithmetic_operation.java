package Control_Statement;
import java.util.*;

public class Arithmetic_operation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        char o =sc.next().charAt(0);

        switch (o) {
            case '+':
                System.out.println(a+b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '%':
                System.out.println(a%b);
                break;
          
            case '*':
                System.out.println(a*b);
                break;
          
            default:
                System.out.println("no working");
                break;
        }
    }
}
