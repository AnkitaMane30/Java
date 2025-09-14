package Experiment4;

public class TestSavingAccount {

	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        // Set interest rate to 4%
        SavingAccount.modifyInterestRate(0.04);

        // Calculate monthly interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Balances after 1 month at 4% interest:");
        System.out.printf("Saver1: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2: Rs %.2f%n", saver2.getSavingsBalance());

        // Set interest rate to 5%
        SavingAccount.modifyInterestRate(0.05);

        // Calculate next month's interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nBalances after next month at 5% interest:");
        System.out.printf("Saver1: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2: Rs %.2f%n", saver2.getSavingsBalance());
	}

}
