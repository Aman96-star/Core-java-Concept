package Overriding;


class Car {
    static void model() {
        System.out.println("Car model");
    }
}

class BMW extends Car {
    static void model() {
        System.out.println("BMW model");
    }
}

public class Method_Hiding  {
    public static void main(String[] args) {
        Car obj = new BMW();
        obj.model();  // Output: Car model
    }
}