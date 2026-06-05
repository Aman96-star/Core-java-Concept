package Exception_handling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void Shows() throws IOException{
        FileReader f =new FileReader("abc.txt");
    }
    public static void main(String[] args) {
        try{
            Shows();
        }
        catch(IOException e ){
            System.out.println("not found file");
        }
    }
}
