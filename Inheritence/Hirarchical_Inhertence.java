package Inheritence;

public class Hirarchical_Inhertence {
    
    public static class Plants{
         void desc(){
                System.out.println("this is parent class");
            }
    }
   
    public static class IndoorPlants extends Plants{
            void desc1(){
                System.out.println("these are the indoor plants ");
            }
    }
   
    public static class OutdoorPlants extends Plants{
        void desc2(){
                System.out.println("these are the outdoor plants ");

            }
    }

    public static void main(String[] args) {
        OutdoorPlants op =new OutdoorPlants();
        op.desc();
        op.desc2();
    }
}
