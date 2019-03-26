class SavingAccounts
{
    static double annualInterestRate = 4;
    private double savingsBalance;
    static double annualInterestLoan = 10;

    SavingAccounts( double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
       this.savingsBalance += savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double calculateMonthlyInterest()
    {   double monthlyInterest;
        if ( savingsBalance >= 0 ){
         monthlyInterest = ( savingsBalance * annualInterestRate )/12;
        setSavingsBalance(monthlyInterest);} else
        {
            monthlyInterest = (savingsBalance * annualInterestLoan )/12;
            setSavingsBalance(monthlyInterest);
        }
        return monthlyInterest;
    }

    static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;

    }

}
public class Main {

    public static void main(String[] args)
    {
        SavingAccounts saver1 = new SavingAccounts(1000.00);
        SavingAccounts saver2 = new SavingAccounts(-3000.00);
        System.out.println("Initial 1: " + saver1.getSavingsBalance());

        System.out.println("Monthly interest for saver1: " + saver1.calculateMonthlyInterest());
        System.out.println("Deposit for saver1: " + saver1.getSavingsBalance());
        System.out.println("Monthly interest for saver2: " + saver2.calculateMonthlyInterest());
        System.out.println("Deposit for saver2: " + saver2.getSavingsBalance());
        SavingAccounts.modifyInterestRate(5);
        System.out.println("Monthly benefit for saver1: " + saver1.calculateMonthlyInterest());
        System.out.println("Monthly benefit for saver2: " + saver2.calculateMonthlyInterest());
        System.out.println("New values for deposit saver1: " + saver1.getSavingsBalance());
        System.out.println("New values for deposit saver2: " + saver2.getSavingsBalance());
    }
}
