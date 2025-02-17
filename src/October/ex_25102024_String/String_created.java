package October.ex_25102024_String;

public class String_created {
    public static void main(String [] args) {

        //How String are created?
        //2 WAYS

        //String datatype
        //name --> reference
        //= --> assignment operator
        //"Trupti" - literal
        //created in String constant pool SCP
        String name1 = "Trupti";

        //created in object Area
        String name2 = new String("Trupti");
        System.out.println(name1);
        System.out.println(name2);
    }
}
