package Overriding;


class Car {
    void model() {
        System.out.println("Car model");
    }
}

class BMW extends Car {
    void model() {
        System.out.println("BMW model");
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Car obj = new BMW();
        obj.model();  // Output: BMW model
    }
}