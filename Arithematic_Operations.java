import java.util.Scanner;

public class Arithematic_Operations {
public static void main(String args[]) {
    int n1, n2, add, sub, mul, div;

    Scanner Scan = new Scanner(System.in);
    System.out.print("Enter Number 1 : ");
    n1 = Scan.nextInt();
    System.out.print("Enter Number 2 : ");
    n2 = Scan.nextInt();
    Scan.close();

    add = n1 + n2;
    sub = n1 - n2;
    mul = n1 * n2;
    div = n1 / n2;

    System.out.println("The Addition of numbers is: "+ add);
    System.out.println("The Subtraction of numbers is: "+ sub);
    System.out.println("The Multiplication of numbers is: "+ mul);
    System.out.println("The Division of numbers is: "+ div);
}
}
