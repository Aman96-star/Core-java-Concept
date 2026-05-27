package Inheritence;

import Inheritence.Dimaond_Problem.Vehicle;

public class Dimaond_Problem {
    public  static class Vehicle{
        void fuelType(){
            System.out.println("Type of Fuels");
        }
    } 
    public  static class two_wheeler extends Vehicle{
        void fuelType1(){
            System.out.println("Type : petrol");
        }
    } 
    public  static class four_Wheeler extends Vehicle{
        void fuelType2(){
            System.out.println("Type : Diesel/petrol");
        }
    } 
    // here this make a  dimond problem.....

    //   public  static class Three_Wheeler extends two_wheeler,four_Wheeler{
    //     void fuelType(){
    //         System.out.println("Type : CNG/petrol");
    //     }
    // } 


    public static void main(String[] args){
        four_Wheeler four =new four_Wheeler();
        four.fuelType();
        // four.fuelType1();
        four.fuelType2();
    }
}
