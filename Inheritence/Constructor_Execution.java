package Inheritence;

public class Constructor_Execution {
    public static class Car{
        Car(){
            System.out.println("Constructor is running ");
        }
    }

    public static class Vehicle extends Car{
        Vehicle(){
            System.out.println("child is running ");
        }
    }
    public static void main(String[] args) {
        Vehicle v =new Vehicle();
        
    }
}
