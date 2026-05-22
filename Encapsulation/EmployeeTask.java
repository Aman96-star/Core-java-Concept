package Encapsulation;

// Create an Employee class with private fields name, baseSalary, and bonus. 
// Write a method calculateTotalSalary() that returns baseSalary + bonus. 
// Ensure bonus is non-negative using setter validation. 
// Print total salary of the employee using getter methods.  
public class EmployeeTask {
    private String name ;
    private int baseSalary;
    private int bonus;

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void setBonus(int bonus) {
        if (bonus >= 0) {
        this.bonus = bonus;
    } else {
        System.out.println("Invalid Bonus");
    }
    }

    public int calculateTotalSalary(){
        return baseSalary+bonus;
    }
    

}
