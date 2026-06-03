package Inheritence;

public class Interface {
    interface A{
        void show();
    } 

    interface B{
        void Dis();
    }

   static class C implements A,B{
        public void show(){
            System.out.println("this is a interface");
        }
        public void Dis(){
            System.out.println("this is a interface 2--------");
        }
    }
    public static void main(String[] args) {
        C cc =new C();
        cc.show();
        cc.Dis();
    }
}
