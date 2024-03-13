class Custom_Exception extends RuntimeException{
    public Custom_Exception(String str){
        super(str);
    }
}

public class P27_Custom_Exception{
    public static void main(String args[]){
        throw new Custom_Exception("This is a Custom Exception message");
    }
}