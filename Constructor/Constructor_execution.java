
public class Constructor_execution{
    public static class Factory{
        Factory(){
            System.out.println("Factory parent construtor is running");
        }
    }
    public static class Car extends Factory{
        Car(){
                    // super();   //automatic by java
                    System.out.println("child construtor is running");
        }

    }

    public static void main(String[] args) {
        Car cc = new Car();
        
    
    }
}

