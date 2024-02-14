import java.util.Scanner;

public class P24_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter number to calculate sum of digits : ");
        n = Scan.nextInt();
        Scan.close();

        while (n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println("The sum is : "+sum);
    }
}
