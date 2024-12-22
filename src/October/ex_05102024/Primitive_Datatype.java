package October.ex_05102024;

public class Primitive_Datatype {
    public static void main(String[] args) {

        //PrimitiveDatatype
        byte b = 10;            // byte --> 1 Byte = 8 bits
        char ch = 'A';          // char --> 2 Byte = 16 bits
        short sh = 123;         // short --> 2 Byte = 16 bits
        int a = 100400;         // int --> 4 Byte = 32 bits
        float f = 13.7F;        // float --> 4 Byte = 32 bits
        long lg = 123456789;    // long --> 8 Byte = 64 bits
        double d = 11.999999;   // double --> 8 Byte = 64 bits
        boolean $ = true;       // boolean --> None

        System.out.println("byte : "+ b + "\n" + "char : "+ ch + "\n" + "short : "+ sh + "\n" +
                "int : "+ a + "\n" + "long : "+ lg + "\n" + "float : "+ f + "\n" +
                "double : "+ d + "\n" + "boolean : "+ $);
    }
}
