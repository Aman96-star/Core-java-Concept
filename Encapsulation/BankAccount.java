package Encapsulation;

//  private fields accountNumber, 
// accountHolderName, and balance.   
// Provide methods to deposit() and withdraw() money. 
// Use getters to display the balance. 
// Ensure withdraw() does not allow balance to go negative.

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance +=amount;
        System.out.println("this is deposit blance :"+balance);
    }
    public void wihdraw(int amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("balance is withrawal : "+amount);
        }
        else{
            System.out.println("balance is insufficient");
        }
    }
}
