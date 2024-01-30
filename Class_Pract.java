import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double s1,s2,s3;

    public int getId() {return id;}
    public String getName() {return name;}
    public double getS1() {return s1;}
    public double getS2() {return s2;}
    public double getS3() {return s3;}

    public void setId(int newId) {
        this.id = newId;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setS1(double news1) {
        this.s1 = news1;
    }
    public void setS2(double news2) {
        this.s2 = news2;
    }
    public void setS3(double news3) {
        this.s3 = news3;
    }

    public void finalize() throws Throwable{
        System.out.println("Student Class"+getId()+"destroyed.");
    } 
}

public class Class_Pract {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Student ClStu1 = new Student();

        System.out.print("Enter Student ID: ");
        ClStu1.setId(Scan.nextInt());

        Scan.nextLine();

        System.out.print("Enter Student Name: ");
        ClStu1.setName(Scan.nextLine());

        System.out.print("Enter Marks for Subject 1: ");
        ClStu1.setS1(Scan.nextDouble());

        System.out.print("Enter Marks for Subject 2: ");
        ClStu1.setS2(Scan.nextDouble());

        System.out.print("Enter Marks for Subject 3: ");
        ClStu1.setS3(Scan.nextDouble());

        Scan.close();


        System.out.println("Student ID: " + ClStu1.getId());
        System.out.println("Student Name: " + ClStu1.getName());
        System.out.println("Marks for Subject 1: " + ClStu1.getS1());
        System.out.println("Marks for Subject 2: " + ClStu1.getS2());
        System.out.println("Marks for Subject 3: " + ClStu1.getS3());

        double avg = (ClStu1.getS1() + ClStu1.getS2() + ClStu1.getS3()) / 3;
        System.out.println("Average Marks: " + avg);

        ClStu1 = null;
    }
}
