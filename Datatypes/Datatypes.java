// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class  Datatypes{
 public static class car{
        int num;
        String carName;
//          System.out.println(num+" "+carName); 
    }
    
    public static void main(String[] args) {
        car carry =new car();
                 System.out.println(carry.num+" "+carry.carName); 

       int a =4;
    //   char c =null;   no null by primitive
        String name ="Aman Verma";
       
        System.out.println(a+" "+name);
       //------------------------------------
        // int x;
        // float y;
        // char ch;
        int arr[]={};
        
       // System.out.println(x+ " "+y+" "+ch);// can't bcz it is loacal varibale if it non static or in some class means instance the give default values 
                System.out.println(arr);
            
            
    }
}



// all blocks --------------------------------

// class Main {
//  public static class car{
//      int num =4321;
//        static int a =34;   // static block
//      float fd =400.2f;   // non static
//     }
    
//     public static void main(String[] args) {
              
//                 car cerry =new car();
//                  System.out.println(cerry.num);
//                 System.out.println(" statc block "+cerry.a+"non static  "+cerry.fd);
            
            
//     }
// }


// declare all primitive datatypes inside a method and try to print them without initialisation---

// class Main {
//  public static class car{
//      int num =4321;
//        static int a =34;   // static block
//      float fd =400.2f;   // non static
     
//      void features(){
//          int va;
//          int arr[]={};
         
//          System.out.println("these are the features  of this car");
//                 //  System.out.println(va);  // it means give a compile time error 

//      }
//     }
    
//     public static void main(String[] args) {
              
//                 car cerry =new car();
//                  System.out.println(cerry.num);
//                 System.out.println(" statc block : "+cerry.a+" non static : "+cerry.fd);
//                 cerry.features();
            
            
//     }
// }

