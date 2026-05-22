package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        Student1 s2 =new Student1();
        BankAccount ac =new BankAccount();

        

        // s.setName("Aman");
        // s.setMarks(0);

        // System.out.println("Name : "+s.getName());
        // System.out.println("marks : "+s.getMarks());

        // s2.setName("Sai Pallavi");
        // s2.setRollNumber(04);
        // s2.setAge(24);

        //  System.out.println("Name : "+s2.getName());
        // System.out.println("roll number : "+s2.getRollNumber());
        // System.out.println("age : "+s2.getAge());
        ac.setAccountHolderName("Sai Pallavi");
        ac.setAccountNumber(1221121);
        
        ac.deposit(34000);
        ac.wihdraw(10000);

         System.out.println("holder Name: "+ac.getAccountHolderName());
        System.out.println("acc number: "+ac.getAccountNumber());
        System.out.println("balance "+ac.getBalance());
    }
}
