package Abstraction.NormalExample;

//The user of bank account class does not need implementation details of the class,
// they only need to know about the public methods and how to use them to perform the desired actions

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
