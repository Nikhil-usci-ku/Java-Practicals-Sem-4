import java.util.Scanner;

public class Km_to_Mile {
    public static void main(String[] args) {
        float km,m;
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter distance in Km : ");
        km = Scan.nextFloat();
        Scan.close();

        m = (km*1000)/1609;
        System.out.println("Distance in Miles is : " + m + "Miles");

    }
}
