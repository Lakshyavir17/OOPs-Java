import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double l, double w) {
        d1 = l;
        d2 = w;
    }
}

class Triangle extends Shape {
    void calculateArea() {
        double area = 0.5 * d1 * d2;
        System.out.println("Area of Triangle = " + area);
    }
}

class Rectangle extends Shape {
    void calculateArea() {
        double area = d1 * d2;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class Practical22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        Triangle t = new Triangle();
        t.getData(d1, d2);
        t.calculateArea();

        Rectangle r = new Rectangle();
        r.getData(d1, d2);
        r.calculateArea();
    }
}



    