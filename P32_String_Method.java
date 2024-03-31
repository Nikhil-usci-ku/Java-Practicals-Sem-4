public class P32_String_Method {
    public static void main(String[] args){
        String Str = "This Is A String.";
        Integer A = 5;
        System.out.println("String : "+Str);
        System.out.println("Length :"+Str.length());
        System.out.println("Uppercase :"+Str.toUpperCase());
        System.out.println("Lowercase :"+Str.toLowerCase());
        System.out.println("Repeat x 5 :"+Str.repeat(A));
        System.out.println("Char at index 5 :"+Str.charAt(A));
        System.out.println("Convert Integer object to String : "+ A.toString());
        System.out.println("Concatenating new string in Str  : "+ Str.concat(A.toString()));
    }
}
