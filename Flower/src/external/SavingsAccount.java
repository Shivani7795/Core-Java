package external;

import internal.BankAccount;

public class SavingsAccount implements BankAccount {
    public void deposit() {
        System.out.println("Money deposited in Savings Account.");
    }

    public void withdraw() {
        System.out.println("Money withdrawn from Savings Account.");
    }

    public void transfer() {
        System.out.println("Money transferred from Savings Account.");
    }

    public void checkBalance() {
        System.out.println("Balance checked for Savings Account.");
    }

    public void viewStatement() {
        System.out.println("Statement viewed for Savings Account.");
    }
}
