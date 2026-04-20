public class block_non_static{
   static class Car{
     {
        System.out.println("non static block ");
    }
   }

    public static void main(String[] args) {
        Car cc =new Car();

    }
}
