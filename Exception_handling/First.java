package Exception_handling;

public class First {
    
    public static void main(String[] args) {
        try{
            int a =10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e ){
            System.out.println("10 cant be divide by 0 ");
        }

        System.out.println("program is running");
    }
}
