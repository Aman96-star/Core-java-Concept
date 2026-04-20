
public class Upcasting {
    
    static class Device{
        void display(){

            System.out.println("this a parent class Device");
        }
    }
    
    static class Smartphone extends Device{
        void call(){

            System.out.println("child class calling ...........");
        }
    }
    
    
    public static void main(String[] args) {
        Smartphone phone =new Smartphone();
       
        Device device =phone;

        device.display();   // work 
     //   device.call();  // error
        


        

    }
}


// upcasting --> Device device =new Smartphone(); // creating a object 