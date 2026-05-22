package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s=new Student();

        s.setName("Aman");
        s.setMarks(0);

        System.out.println("Name : "+s.getName());
        System.out.println("marks : "+s.getMarks());

    }
}
