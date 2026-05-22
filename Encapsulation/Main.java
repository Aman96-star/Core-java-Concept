package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        Student1 s2 =new Student1();
        BankAccount ac =new BankAccount();
        Product pro =new Product();
        Product pro2 =new Product();

        EmployeeTask ep =new EmployeeTask();

        

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
       
        // ac.setAccountHolderName("Sai Pallavi");
        // ac.setAccountNumber(1221121);
        
        // ac.deposit(34000);
        // ac.wihdraw(10000);

        //  System.out.println("holder Name: "+ac.getAccountHolderName());
        // System.out.println("acc number: "+ac.getAccountNumber());
        // System.out.println("balance "+ac.getBalance());

        // pro.setProductId(101);
        // pro.setProductName("Cloths");
        // pro.setPrice(2000);

        // System.out.println(pro.getProductName());
        // System.out.println(pro.getProductId());
        // System.out.println(pro.getPrice());

        // System.out.println("-----------------------------------");
        
        // pro2.setProductId(104);

        // pro2.setProductName("Utensils");
        // pro2.setPrice(5000);

        // System.out.println(pro2.getProductName());
        // System.out.println(pro2.getProductId());
        // System.out.println(pro2.getPrice());

        ep.setName("Aman Verma");
        ep.setBaseSalary(44000);
        ep.setBonus(4000);

        
        System.out.println("Holder Name : "+ep.getName());
        System.out.println("Base Salary : "+ep.getBaseSalary());
        System.out.println("bonus :"+ep.getBonus());
        System.out.println("Total Salary : "+ep.calculateTotalSalary());
    }
}
