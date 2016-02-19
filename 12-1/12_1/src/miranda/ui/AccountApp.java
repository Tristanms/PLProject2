package ui;

import business.Account;
import business.CheckingAccount;
import business.Transactions;

public class AccountApp {
    public static void main(String[] args) {

        //Create a Checking Account
        CheckingAccount acc = new CheckingAccount();

        //Print out intro screen
        System.out.println("Welcome to the Account Calculator");
        System.out.println("\nStarting Balance");
        System.out.println("Checking: " + acc.getBalanceFormatted());
        System.out.println("\nEnter the transactions for the month");

        //set up stop variables for while loop
        Boolean go = true;
        String choice = "y";

        //continually prompt user for new withdrawl/deposits
        while (choice.equalsIgnoreCase("y") && go) {
            //get input from user
            String trans_type = Console.getString("\nWithdraw or deposit? (w/d): ");
            if (trans_type.equalsIgnoreCase("w") || trans_type.equalsIgnoreCase("d")) {

                //Withdrawl
                if (trans_type.equalsIgnoreCase("w")) {
                    double amount = Console.getInt("Amount: ");
                    while (amount>acc.getBalance()){
                        System.out.println("\nPlease enter amount less than current account balance");
                        amount = Console.getInt("Amount: ");
                    }
                    Transactions.withdraw(acc, amount);

                    //Deposit
                } else if (trans_type.equalsIgnoreCase("d")) {
                    double amount = Console.getInt("Amount: ");
                    while (amount > 10000) {
                        System.out.println("\nEnter a deposit amount less than $10,000");
                        amount = Console.getInt("Amount: ");
                    }
                    Transactions.deposit(acc, amount);
                }
            }

            //check to see if continue
            String cont = Console.getString("\nContinue? (y/n): ");

            //if not, print out the fees and final balance
            if (cont.equalsIgnoreCase("n")) {
                System.out.println("\nMonthly Fees\nChecking fee:                 " + acc.getMonthlyFeeFormatted());
                acc.subtractMonthlyFee();
                System.out.println("\nFinal Balance\n" + "Checking: " + acc.getBalanceFormatted());
                go = false;
            } else {
            }
        }

    }
}
