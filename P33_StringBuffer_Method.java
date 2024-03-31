public class P33_StringBuffer_Method {
    public static void main(String[] args) {
        StringBuffer Buff = new StringBuffer("This Is A StringBuffer. ");
        
        Buff.append("String Methods Can Be Called For StringBuffer Object.");
        System.out.println("Appended to StringBuffer : "+Buff);

        System.out.println("StringBuffer Capacity : "+Buff.capacity());

        Buff.insert(23," [INSERTED without meaning]");
        System.out.println("Inserted in StringBuffer : "+Buff);

        Buff.replace(23, 50, " [REPLACED Inserted]");
        System.out.println("Replaced Inserted portion in StringBuffer : "+Buff);

        Buff.delete(23, 43);
        System.out.println("Deleted Replaced portion in StringBuffer : "+Buff);

        Buff.reverse();
        System.out.println("Reversed StringBuffer : "+Buff);
    }
}
