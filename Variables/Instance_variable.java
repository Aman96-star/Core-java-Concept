
public class Instance_variable{
    public static class Car{
        
        int gear =5;
        String carName ="thar";
    
    }

    public static void main(String[] args) {
      Car cc =new Car();
      Car cc2 =new Car();
      cc2.gear =12;
      cc2.carName ="Scoda";
     System.out.println(cc2.gear + "   "+ cc2.carName);
     System.out.println(cc.gear + "   "+ cc.carName);
    
  
        
    }
}
