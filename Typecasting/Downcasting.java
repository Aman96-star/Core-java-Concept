public class Downcasting {
    
    static class Watches{
        void display(){
            System.out.println("parent class is run ");
        }
    }
    static class Brand extends Watches{
        void display1(){
            System.out.println("child class is run ");
        }
    }

    public static void main(String[] args) {
        // Brand bb =new Watches();   // this is not allowed in java 
        Watches w =new Brand();    // first upcasting

        w.display();  // it will run the parent method
        // w.display1();

        // Brand b =(Brand) w;  // this downcasting

        // b.display();
        // b.display1();

        Watches ww =new Watches();

        // Brand b =(Brand)ww;    // Class cast exeception

    }
}
