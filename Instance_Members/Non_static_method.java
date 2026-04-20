public class Non_static_method {
    static int num=0;
     int num2 =23;

    static void staticShow(){
        System.out.println("static method runs");
    }
        void show(){
            System.out.println("non-static method runs");
            System.out.println(num);
            staticShow();
        }
    public static void main(String[] args) {
        Non_static_method ma =new Non_static_method();
        ma.show();
        // ma.staticShow();     //it will also run
        // Non_static_method.staticShow();

        
    }
}

// sdskjd
