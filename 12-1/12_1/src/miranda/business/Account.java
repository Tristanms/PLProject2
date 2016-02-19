package business;

import account.interfaces.Depositable;
import account.interfaces.Balanceable;
import account.interfaces.Withdrawable;
import java.text.NumberFormat;

public class Account implements Balanceable, Depositable, Withdrawable {

    public double balance = 1000.00;

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double amount) {this.balance = amount;}


    @Override
    public void deposit(double amount) {this.balance = balance + amount;}

    @Override
    public void withdraw(double amount) {this.balance = balance - amount;}

    public String getBalanceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(balance);
    }
}
