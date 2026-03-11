class University {

    static int totalStudents;
    static String universityName;

    static {
        universityName = "GTU University";
        totalStudents = 0;
        System.out.println("Static Block Executed");
     
    }
 
    {
        System.out.println("Instance Block Executed");
    }

    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        System.out.println("Main Method Started");
	   System.out.println("University Name: " + universityName);

        University s1 = new University();
        University s2 = new University();
	University s3 = new University();

        System.out.println("Total Students: " + getTotalStudents());
        System.out.println("240390107019");
    }
}
