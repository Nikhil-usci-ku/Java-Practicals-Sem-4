import java.util.Scanner;

public class P05_Odd_Even {
public static void main(String args[]) {
    int n1;

    Scanner Scan = new Scanner(System.in);
    System.out.print("Enter Number 1 : ");
    n1 = Scan.nextInt();
    Scan.close();

    if (n1%2==0) {System.out.print("The number is Even.");}
    else {System.out.print("The number is Odd.");}
}
}