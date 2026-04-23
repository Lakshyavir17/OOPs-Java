class Employee {
    String name = "Rahul";
    String department = "IT";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 10;
    String projectName = "AI Development";

    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class Practical24{
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails();
    }
}