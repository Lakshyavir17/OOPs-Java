import java.util.Scanner;

class Practical19 {

    String collegeName;

    Practical19(String name) {
        collegeName = name;
    }

    class Admission {

        String studentName;
        String course;

        void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void displayDetails() {
            System.out.println("\nAdmission Details");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Enrolled: " + course);
        }
    }

    public static void main(String[] args) {

        System.out.println("240390107019");

        Practical19 c = new Practical19("S.P.B Patel Engineering College");
        Practical19.Admission a = c.new Admission();

        a.acceptDetails();
        a.displayDetails();
    }
}