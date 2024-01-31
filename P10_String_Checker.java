import java.util.Scanner;

public class P10_String_Checker {
    public static void main(String[] args) {
        String s;

        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter Character : ");
        s = Scan.nextLine();
        Scan.close();


        if (s.length()>1){
            System.out.println("The input is more than 1 character.");
            return;
        }


        char c = s.toLowerCase().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("It is a Vowel.");
        }
        else if (s.matches("[A-Za-z]+")){
            System.out.println("It is a Consonant.");
        }
        
        else {System.out.println("It is not a Letter.");}
    }
}
