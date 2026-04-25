package Control_Statement;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char v =sc.next().charAt(0);
        switch(v){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("it is a vowel");
                break;

             default:
             System.out.println("it is a constant");   

    }
    }
}
