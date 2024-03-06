public class Exception_Handling {
    public static void main(String[] args) {
        try {
            String a ="Nikhil is a Boy";
            char c = a.charAt(29);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException"); 
        }
    }
    public class ArithmaticException {
        public static void main (String[] args) { 
          int a=5; 
          int b=0; 
            try{ 
              System.out.println(a/b); 
            } 
          catch(ArithmeticException e){ 
            System.out.println(e.toString()); 
            }
        }
    }
}