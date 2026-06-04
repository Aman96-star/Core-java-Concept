package Abstraction;

public class Diff_Abstraction_Interface {
    interface  Bags{
        void Type();
    }

    abstract static class type_bags{
       abstract void desc();
    }

    static class brands extends type_bags{
        void Type(){
            System.out.println("Travel tourist type");
        }

        void desc(){
            System.out.println("best bag for a travaleling in jungle");
        }
    }
    public static void main(String[] args) {
        brands bb =new brands();
        bb.Type();
        bb.desc();
    }
}
