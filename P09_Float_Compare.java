import java.util.Scanner;

public class P09_Float_Compare {
public static void main(String args[]) {
    float n1, n2;

    Scanner Scan = new Scanner(System.in);
    System.out.print("Enter Number 1 : ");
    n1 = Scan.nextFloat();
    System.out.print("Enter Number 2 : ");
    n2 = Scan.nextFloat();
    Scan.close();

    if (n1==n2) {System.out.println("The numbers are same.");}
    else {System.out.println("The numbers are different.");}
}
}