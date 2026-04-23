import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    protected String item;
    protected int qty;
    protected int orderId;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = (int)(Math.random() * 1000);
        System.out.println("Order Placed Successfully");
        System.out.println("Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder {

    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order Cancelled Successfully");
        } else {
            System.out.println("Invalid Order ID");
        }
    }

    public void generateBill() {
        int price = 100;
        int total = qty * price;

        System.out.println("----- Bill -----");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Amount: Rs. " + total);
    }
}

public class Practical29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FinalOrder order = new FinalOrder();

        System.out.println("Enter Item Name:");
        String item = sc.nextLine();

        System.out.println("Enter Quantity:");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.println("Enter Order ID to Cancel:");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid Choice");
        }
    }
}