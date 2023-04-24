package Encapsulation;

//By encapsulating the internal state of BankAccount class,
// we can ensure it is not modifies in unexpected ways by external code.

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(300);
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.setAccountNumber("32512");
        System.out.println(bankAccount.getAccountNumber());
    }
}
