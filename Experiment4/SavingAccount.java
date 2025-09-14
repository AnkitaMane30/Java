package Experiment4;

public class SavingAccount {
	private static double annualInterestRate; // shared by all accounts
    private double savingsBalance;            // individual balance

    // Constructor
    public SavingAccount(double balance) {
        if (balance > 0)
            this.savingsBalance = balance;
        else
            this.savingsBalance = 0.0;
    }

    // Calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Getter for balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
