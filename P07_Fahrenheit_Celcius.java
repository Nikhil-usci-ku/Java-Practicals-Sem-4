import java.util.Scanner;

public class P07_Fahrenheit_Celcius {
public static void main(String[] args) {
    float f,c;
    Scanner Scan = new Scanner(System.in);
    System.out.print("Enter temprature in Fahrenheit : ");
    f = Scan.nextFloat();
    Scan.close();

    c= ((f-32)*5)/9;
    System.out.print("Temprature in Celcius is : " + c);

}
}
    