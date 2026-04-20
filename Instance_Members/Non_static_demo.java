public class Non_static_demo {
    static class Car{
        int carId;
        String Model;
        static int count;

        Car(int id,String mo){   
            carId =id;
            Model =mo;
            count++;    // increase for every new object is created
        }
    }

    public static void main(String[] args) {
        Car cc =new Car(1,"BMW");
        Car cc2 =new Car(2,"creata");

         System.out.println(cc.carId + " " + cc.Model);
        System.out.println(cc2.carId + " " + cc2.Model);

        System.out.println("Total Cars: " + Car.count);
    }
}
