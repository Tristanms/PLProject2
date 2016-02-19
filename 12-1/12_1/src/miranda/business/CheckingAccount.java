package business;


import java.text.NumberFormat;

public class CheckingAccount extends Account {

    double monthlyFee = 1.00;

    public void subtractMonthlyFee() {
        this.balance = this.balance - monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {}

    public double getMonthlyFee() {

        return 1;
    }

    public String getMonthlyFeeFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(monthlyFee);
    }
}
