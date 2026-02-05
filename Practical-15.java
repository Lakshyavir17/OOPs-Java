import java.util.Scanner;

class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount: " + finalAmount);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill Amount: " + finalAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator b = new BillGenerator();

        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer");

        System.out.print("Enter Customer Type: ");
        int choice = sc.nextInt();

        System.out.print("Enter Item Total: ");
        int total = sc.nextInt();

        if (choice == 1) {
            b.generateBill(total);
        } 
        else if (choice == 2) {
            System.out.print("Enter Flat Discount: ");
            int discount = sc.nextInt();
            b.generateBill(total, discount);
        } 
        else if (choice == 3) {
            System.out.print("Enter Discount Percentage: ");
            double percent = sc.nextDouble();
            b.generateBill(total, percent);
        }
    }
}
