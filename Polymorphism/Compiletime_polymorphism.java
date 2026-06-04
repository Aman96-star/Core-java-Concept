package Polymorphism;

public class Compiletime_polymorphism {
   public static class A{
    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(int a,int b ,int c){
System.out.println("product"+(a+b+c));
}
    void add(String name){
System.out.println("name : "+name);
}
   }
   
   public static void main(String[] args) {
    
       A aa =new A();
       aa.add(23,1);
       aa.add(23,1,7);
       aa.add("AmanVerma");
       
       
   }

   
}
