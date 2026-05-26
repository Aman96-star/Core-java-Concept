package Inheritence;
//   Making Syntax static inner class 
public class polarisIT {
        void Desc(){
            System.out.println("IT company in chennai MNC");
        }
   
    public static class virtusa extends polarisIT{
        @Override
        void Desc(){
            System.out.println("IT child 1");
        }
    }
    public static class Optimus extends polarisIT{
        @Override
        void Desc(){
            System.out.println("IT child 2");
        }
    }

    public static void main(String[] args) {
        polarisIT a =new virtusa();
        a.Desc();
    }

}
