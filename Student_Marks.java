import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double s1,s2,s3;

    public void setData() {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = Scan.nextInt();

        Scan.nextLine();

        System.out.print("Enter Student Name: ");
        name = Scan.nextLine();

        System.out.print("Enter Marks for Subject 1: ");
        s1 = Scan.nextDouble();

        System.out.print("Enter Marks for Subject 2: ");
        s2 = Scan.nextDouble();

        System.out.print("Enter Marks for Subject 3: ");
        s3 = Scan.nextDouble();
        Scan.close();
    }

    public void displayData() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Marks for Subject 1: " + s1);
        System.out.println("Marks for Subject 2: " + s2);
        System.out.println("Marks for Subject 3: " + s3);

        double avg = (s1 + s2 + s3) / 3;
        System.out.println("Average Marks: " + avg);
    }
}

public class Student_Marks {
    public static void main(String[] args) {
        Student student = new Student();
        student.setData();
        student.displayData();
    }
}
