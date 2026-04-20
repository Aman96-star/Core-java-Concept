
public class Construct_chaning{

   public static  class Car{
        int year;
        String Model;
        // 1st constructor
        Car(int year,String Model){
            this.year=year;
            this.Model=Model;

        } 
        Car(String Model){
            this(2024,Model);
        }

    }

public static void main(String[] args){
System.out.println("This is Aman Verma");
Car cc =new Car("BMW-2r");
System.out.println("here the value by constructor chaning : "+"year - "+cc.year+" Model - "+cc.Model);


}
}