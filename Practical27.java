import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }
}

public class Practical27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter average marks:");
        double avg = sc.nextDouble();

        Result r = new Result();
        System.out.println("Result: " + r.getDivision(avg));
    }
}