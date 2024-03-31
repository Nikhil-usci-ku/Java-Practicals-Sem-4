public class P30_Wrapper_Method{
    public static void main(String[] args){
        Character Chara = 'T';
        Integer Integ = 2;
        Boolean Boole = true;
        Double Doubl = 23.4;
        System.out.println("Autoboxed Objects");
        System.out.println("Character : "+Chara.charValue());
        System.out.println("Integer : "+Integ.intValue());
        System.out.println("Boolean : "+Boole.booleanValue());
        System.out.println("Double : "+Doubl.doubleValue());
        System.out.println();


        char ch = Chara;
        int in = Integ;
        boolean bo = Boole;
        double dou = Doubl;
        System.out.println("Unboxed to primitive type");
        System.out.println("char : "+ch);
        System.out.println("int : "+in);
        System.out.println("boolean : "+bo);
        System.out.println("double : "+dou);
    }
}