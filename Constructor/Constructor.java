
public class Datatypes_overflow_underflow {
    public static class Car{
        
        int gear;
        String carName;
        
        Car(int gear,String carName){
            this.gear=gear;
            this.carName =carName;
        }
        

    
    }

    public static void main(String[] args) {
      Car cc =new Car(14,"BOLERO");
     
     System.out.println(cc.gear + "   "+ cc.carName);
    
        
    }
}
 {
    
}
