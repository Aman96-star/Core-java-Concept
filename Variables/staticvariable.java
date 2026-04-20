public class staticvariable {
    static public class Car{
        static int value = 10;

    }

    public static void main(String[] args) {
    //  Car cc =new Car();
     System.out.println(Car.value);    // accessible without creating object 
    }

}
