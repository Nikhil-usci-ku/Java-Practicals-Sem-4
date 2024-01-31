import java.util.Scanner;

public class P03_04_Greatest_Lowest {
public static void main(String[] args) {
    int n1, n2, n3, small, large;
    
    Scanner Scan = new Scanner(System.in);
    System.out.print("Enter Number 1 : ");
    n1 = Scan.nextInt();
    System.out.print("Enter Number 2 : ");
    n2 = Scan.nextInt();
    System.out.print("Enter Number 3 : ");
    n3 = Scan.nextInt();
    Scan.close();

    if (n1>n2 && n1>n3) {
        large = n1;
        if (n2>n3) {small = n3;} 
        else {small = n2;}
    }
    else if (n2>n1 && n2>n3) {
        large = n2;
        if (n1>n3) {small = n3;} 
        else {small = n1;}
    }
    else {
        large = n3;
        if (n1>n2) {small = n2;} 
        else {small = n1;}
    }
    System.out.println("Greatest Number : " + large);
    System.out.print("Smallest Number : " + small);
}
}
