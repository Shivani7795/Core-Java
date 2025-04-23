package external;

import internal.Bank;

public class StateBank implements Bank {
    public void depositMoney() {
        System.out.println("Money deposited in State Bank.");
    }

    public void withdrawMoney() {
        System.out.println("Money withdrawn from State Bank.");
    }

    public void checkBalance() {
        System.out.println("Checking balance in State Bank.");
    }
}
