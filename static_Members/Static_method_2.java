public class Static_method_2 {

    static class Animal {
       int  a=10;
       
       static void show(){
                   System.out.println("call the static method ");

       }
    }

    public static void main(String[] args) {
        // System.out.println();
        // Animal am =new Animal();
        Animal.show();

    }
}
