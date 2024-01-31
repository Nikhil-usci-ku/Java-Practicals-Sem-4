import java.util.Scanner;

public class P08_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n,t1=0,t2=1,c;

        System.out.print("Enter number of terms to print : ");
        n = Scan.nextInt();
        Scan.close();
        System.out.println("Fibonacci Series : ");
        while (n>0){
            n--;
            System.out.print(t1 + "  ");
            c = t1+t2;
            t1=t2;
            t2=c;
        }

        

    }

}