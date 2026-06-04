package Polymorphism;

import Inheritence.Constructor_Chaining.Bikes;

public class Runtime_Polymorphism {
    public static class Bike{
        Bike(){
            Engine();
            Speed();
            Range();
        }
    
        void Engine(){
            System.out.println("cc ?");
        }
        
        void Speed(){
            System.out.println("Speed range:  ?");
            
        }
        
        void Range(){
            
            System.out.println("price range:  ?");
        }
    } 

    public static class Triumph extends Bike{
        @Override
        public void Range(){
            System.out.println("hi , price is 4lkh");
        }
    } 

    public static class Ns extends Bike{
        @Override
        public void Speed(){      // oveeride the speed method
            System.out.println("speed 240+");
        }
    } 
    public static void main(String[] args) {
       
        Bike bb =new Ns();

        bb.Speed();

    }
}
