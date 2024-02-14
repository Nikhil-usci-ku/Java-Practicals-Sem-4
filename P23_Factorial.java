import java.util.Scanner;

public class P23_Factorial {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int n,f=1;
        System.out.print("Enter number : ");
        n = Scan.nextInt();
        Scan.close();

        if (n>=0){
            while (n>0){
                f=f*n;
                n--;
            }
            System.out.print("The factorial is: "+f);
        }
        else{
            System.out.print("Factorial of negetive number is not defined.");
        }
    }
}
