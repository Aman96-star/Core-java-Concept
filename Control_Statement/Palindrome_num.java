package Control_Statement;


public class Palindrome_num  {
    public static void main(String[] args) {
       int  n =12321;
        int or =n;
        int rev =0;
        while(n>0){
            int store =n%10; //  4
            rev =rev*10 +store;
            n=n/10;
            
        }
        System.out.println("here it is "+rev);
        if(or == rev){
            System.out.println("yes it is ");
            
        }
        else {
            System.out.println("no");
        }
    }
}
