import java.util.Scanner;

class Add_num{
    int sum;
    int Add_num_in(int x,int y){
        sum = x +y;
        return sum;
    }        
}

public class Add_by_Class{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int a,b;
        System.out.print("Enter number 1 : ");
        a = Scan.nextInt();

        System.out.print("Enter number 2 : ");
        b = Scan.nextInt();
        Scan.close();

        Add_num var_name =  new Add_num();
        var_name.Add_num_in(a, b);
        System.out.println("The sum is : " + var_name.sum);
    }
}
