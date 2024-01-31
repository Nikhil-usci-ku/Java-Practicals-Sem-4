import java.util.Scanner;

public class P14_Right_Triangle_1 {
    public static void main(String[] args) {
        int size;

        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter size of triangle : ");
        size = Scan.nextInt();
        Scan.close();

        for (int i=1;i<=size;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
