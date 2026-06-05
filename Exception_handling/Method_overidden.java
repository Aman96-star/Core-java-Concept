package Exception_handling;

import java.io.IOException;

public class Method_overidden {
    
    public static class  Animal {
        void show1() throws IOException{
            System.out.println("Parent exception");
        }
    }
    public static class  Child extends Animal {
        @Override
        void show1() throws IOException{
            System.out.println("Child exception");
        }
    }

    public static void main(String[] args) throws IOException{
        Child c =new Child();
        c.show1();
    }
}
