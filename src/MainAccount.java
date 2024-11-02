public class MainAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        System.out.println(account.getBalance());
        account.deposit(558);

        account.withdraw(864);

    }
}
