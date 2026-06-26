

public class Core_Constructor_01 {
    static public class Aman{
        int a ;
        String sys;

        
    }
    public static void main(String[] args) {
        System.out.println("hi ");
        Aman Am =new Aman();
        Am.a=44;
        Am.sys ="Verma24";
        System.out.println("num and name "+Am.a+" "+Am.sys);

        Aman Am2 =new Aman();
        Am2.a=20;
        Am2.sys ="Vaisnav24";
        System.out.println("num and name "+Am2.a+" "+Am2.sys);

          Am2.a=90;
        Am2.sys ="how are u";
        System.out.println("num and name "+Am2.a+" "+Am2.sys);

    }
}
