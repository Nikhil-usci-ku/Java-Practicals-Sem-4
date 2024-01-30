import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        int num;

        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number to create tables : ");
        num = Scan.nextInt();
        Scan.close();
        System.out.println("The table is :");
        for (int i=1;i<11;i++){
            System.out.println(num+" X "+i+ " = "+num*i);
        }
    }
}
