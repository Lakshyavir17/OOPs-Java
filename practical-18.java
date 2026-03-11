class BankAccount
{
    String account_holder_name;
    double balance;

    static double interest_rate = 5.0;

    BankAccount(String name, double bal)
    {
        account_holder_name = name;
        balance = bal;
    }

    void calculateInterest()
    {
        double interest = (balance * interest_rate) / 100;
        System.out.println("Interest Earned: " + interest);
    }

    void display()
    {
        System.out.println("Account Holder Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
	System.out.println("2403901017019");
    }

    static void updateInterestRate(double newRate)
    {
        interest_rate = newRate;
    }

    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount("Rahul", 10000);
        BankAccount a2 = new BankAccount("Amit", 20000);

        a1.display();
        a1.calculateInterest();

        a2.display();
        a2.calculateInterest();

        BankAccount.updateInterestRate(7.0);

        System.out.println("Updated Interest Rate Applied");

        a1.calculateInterest();
        a2.calculateInterest();
    }
}