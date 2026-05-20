package Encapsulation;

public class EmployeeMain {
    public static class Employee{
        private int salary =2000;

        public void setSalary(int salary){
            this.salary =salary;
        }

        public int  getSalary(){
            return salary;
        }
    }

    public static void main(String[] args) {
        Employee ee = new Employee();
    System.out.println(ee.getSalary());
    
    ee.setSalary(10000);     // set the value 
    System.out.println(ee.getSalary());

    }
}
