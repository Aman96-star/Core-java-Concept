package Exception_handling;

public class Throw {

    public static void main(String[] args) {
        int age =15;
        if(age<18){
            throw new ArithmeticException(" -------not elligible to vote---------");
        }
        System.out.println("yes ellegible for vote");
    }
}