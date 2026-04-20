
public class static_role {
    static int num=0;
     int num2 =23;

     void show(){
         System.out.println("non-static method runs");
       
        }
        static void staticShow(){
            System.out.println("static method runs");
          

        }
    public static void main(String[] args) {
        static_role ma =new static_role();
        ma.show();
        // ma.staticShow();     //it will also run
    
        
    }
}


