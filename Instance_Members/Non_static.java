
public class Non_static {

    static class Car{
        int x=90;
        static String val ="common value";

        void show(){
            System.out.println(this.x);
            // System.out.println(this.val);
        }
    }
    public static void main(String[] args) {
        // Non_static.x;
                // System.out.println(Car.val);
        Car cc =new Car();
        cc.show();

    }
}
