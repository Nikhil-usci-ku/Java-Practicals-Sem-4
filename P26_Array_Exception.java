public class P26_Array_Exception {
        public static void main (String[] args) { 
          int arr[] = {5,7,9,11}; 
            try{ 
              System.out.println(arr[4]); 
            } 
          catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println("The array exception is : "+e.toString());
        }
    }
}
