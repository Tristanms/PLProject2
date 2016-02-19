package business;

import account.interfaces.Depositable;
import account.interfaces.Balanceable;
import account.interfaces.Withdrawable;

public class Account implements Balanceable, Depositable, Withdrawable {

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void setBalance(double amount) {

    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    String getBalanceFormatted() {
        return "a";
    }
}
