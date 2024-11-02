public class BankAccount {

    private String accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void withdraw(int amount) {
        if ((balance - amount) < 0) {
            System.out.println("Withdrawal not allowed");
        } else {
            this.balance = balance - amount;
            System.out.println(amount + " dollars were withdrawn from the account");
            System.out.println("Your current balance is " + balance);
        }
    }
    public void deposit(int amount) {
        this.balance = balance + amount;
        System.out.println(amount + " dollars were deposited into the account");
        System.out.println("Your current balance is " + balance + " $");
    }
}
