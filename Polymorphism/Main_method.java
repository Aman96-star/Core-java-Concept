package Polymorphism;

public class Main_method {
   public static class parent{
public static void main(String[] args) {
    System.out.println("main method");
}
}
   
   
    public static class child extends parent{
public static void main(String[] args) {
    System.out.println("Override a  main method");
}
}
    public static void main(String[] args) {
    //  child cd = new child();
        // child.main(args);

    }
    
}


