//note: this is simple constructor making multiple construcotr each is seperated object
public class Copy_constructor{
    public static class Car{
        
        int gear ;
        String carName;
        
        // default
        Car(){
            
        }
        //copy constructor
        // Car(Car cc2){
        //   this.gear =cc2.gear;
        //   this.carName =cc2.carName;
        // }
        
        
    
    }

    public static void main(String[] args) {
      Car cc =new Car();
      Car cc2 =new Car();
      
     cc.gear=2;  //set the value 
     cc.carName ="bmw";
     System.out.println(cc.gear + "   "+ cc.carName);
     
    //  Car cc2 =new Car(cc);  // then copy
            System.out.println(cc2.gear + "   "+ cc2.carName);
    }
}


// Actual copy constructor:

/* 


public class Copy_constructor{
    public static class Car{
        
        int gear ;
        String carName;
        
        // default
        Car(){
            
        }
        //copy constructor
        Car(Car cc2){
          this.gear =cc2.gear;
          this.carName =cc2.carName;
        }
        
        
    
    }

    public static void main(String[] args) {
      Car cc =new Car();
  
      
     cc.gear=2;  //set the value 
     cc.carName ="bmw";
     System.out.println(cc.gear + "   "+ cc.carName);
     
     Car cc2 =new Car(cc);  // then copy
            System.out.println(cc2.gear + "   "+ cc2.carName);
    }
}

*/
