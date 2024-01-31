import java.util.Scanner;
public class P11_Leap_Year {
    public static void main(String[] args) {
        int year;
        
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter Year : ");
        year = Scan.nextInt();
        Scan.close();

        if (year%4==0){
            if (year%100==0){
                if (year%400==0){System.out.print("It is a Leap Year.");}
                else {System.out.print("It is not a Leap Year");}
            }
            else {System.err.println("It is a leap year.");}
        }
        else {System.out.println("It is not a Leap Year.");}
    }
}
