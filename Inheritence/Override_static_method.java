package Inheritence;

public class Override_static_method {
    
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
// asdjas
// it gives parent only menas it not not override for override u should remove the statci keyword