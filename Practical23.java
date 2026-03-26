import java.util.Scanner;

class BankAccount {
    double accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(double accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Low balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest: " + (balance * 5 / 100));
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount(int year) {
        System.out.println("Maturity: " + (balance + balance * 7 * year / 100));
    }
}

public class Practical23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double accNo = sc.nextDouble();
        String name = sc.next();
        double bal = sc.nextDouble();

        double dep = sc.nextDouble();
        double wd = sc.nextDouble();
        int year = sc.nextInt();

        SavingAccount sa = new SavingAccount();
        sa.openAccount(accNo, name, bal);
        sa.deposit(dep);
        sa.withdraw(wd);
        sa.calculateInterest();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(accNo, name, bal);
        fd.maturityAmount(year);
    }
}



