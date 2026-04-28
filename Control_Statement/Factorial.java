package Control_Statement;

public class Factorial {
   public static void main(String[] args) {
     int n =4;
    int fact =1;
    for(int i=n;i>0;i--){
        fact =fact*i;
    }

    System.out.println("factorial : "+fact);
   }
}
