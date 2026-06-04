package Polymorphism;

public class Non_overiden {
   
    static class Cars{
            // final void Wheels(){
            //     System.out.println("Wheels should be 4 only not less or more[FINAL]");
            // }
            // static void Wheels(){
            //     System.out.println("Wheels should be 4 only not less or more[STATIC]");
            // }
            private void Wheels(){
                System.out.println("Wheels should be 4 only not less or more[STATIC]");
            }
    }

    static class Tata extends Cars{
            // void Wheels(){
            //     System.out.println("----------");
            // }

            //  void Wheels(){
            //     System.out.println("----------");
            // }
                @Override
              void Wheels(){
                System.out.println("----------");
            }


   
        }


   
   
    public static void main(String[] args) {
        Tata t = new Tata();
        t.Wheels();
    }
}
