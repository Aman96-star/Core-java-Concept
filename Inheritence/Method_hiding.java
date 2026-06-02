package Inheritence;

public class Method_hiding {
    
    public static class Cars{
        static void just(){
            System.out.println("hi this isha just parent");
        }
    } 
    public static class Royal_Royace extends Cars{
        static void just(){
            System.out.println("hi this child");
        }
    } 
    
    public static void main(String[] args) {
        Cars rr =new Royal_Royace();
        rr.just();
    }
}

