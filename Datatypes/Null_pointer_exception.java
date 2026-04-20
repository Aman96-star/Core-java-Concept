import java.util.Arrays;
public class Null_pointer_exception {
    public static class Car{
        void modal(){
            String name =null;
            System.out.println(name.length());
        }
    }

    public static void main(String[] args) {
      Car cc =new Car();
      cc.modal();
   
        
        
    }
}
