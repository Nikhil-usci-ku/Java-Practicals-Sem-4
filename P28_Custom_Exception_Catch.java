class Custom_Exception extends Exception{
    public Custom_Exception(String str){
        super(str);
    }
}

public class P28_Custom_Exception_Catch{
    public static void main(String args[]){
        try{
            throw new Custom_Exception("This is a Custom Exception message");
        }
        catch (Custom_Exception e){
            System.out.println("The custom exception is : ");
            System.out.println(e);
        }
    }
}