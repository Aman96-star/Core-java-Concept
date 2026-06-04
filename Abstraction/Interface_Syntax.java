package Abstraction;

public class Interface_Syntax {

    interface Technologies{
        void Techstack();
    }

    static class frontend implements Technologies{
        @Override
       public  void Techstack(){   // When overriding an interface method, you cannot reduce the access level. Your method is package-private (void), but it must be public.
            System.out.println("HTML, CSS and Javascript");
        }
    }
    public static void main(String[] args) {
        frontend f =new frontend();
        f.Techstack();
    }
}
