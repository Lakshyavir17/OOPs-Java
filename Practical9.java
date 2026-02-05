import java.util.Scanner;

class Practical9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        System.out.print("Enter height of rectangle: ");
        double h = sc.nextDouble();
        Rectangle r = new Rectangle(w, h);

        System.out.println("\nArea of Rectangle: " + r.getArea());
        System.out.println("Perimeter of Rectangle: " + r.getPerimeter());

        sc.close();
    }
}

class Rectangle {

    double width = 1;
    double height = 1;
    Rectangle() {
        width = 1;
        height = 1;
    }
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}

