class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Home Loan EMI: " + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    void calculateEMI(int principal, int time) {
        float rate = 10;
        float r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Personal Loan EMI: " + emi);
    }
}

public class Main {
    public static void main(String[] args) {
        LoanCalculator lc = new LoanCalculator();

        lc.calculateEMI(500000, 20, 7.5f);
        lc.calculateEMI(300000.0, 5, 9.0);
        lc.calculateEMI(100000, 2);
    }
}
