package Inheritence;

 class polaris{
        void Desc(){
            System.out.println("IT company in chennai MNC");
        }
    }
   
      class virtusa extends polaris{
        @Override
        void Desc(){
            System.out.println("IT child 1");
        }
    }
     class Optimus extends polaris{
        @Override
        void Desc(){
            System.out.println("IT child 2");
        }
    }

    public class polarisIT2{
        public static void main(String[] args) {
            polaris a =new virtusa();
            a.Desc();
        }

    }

