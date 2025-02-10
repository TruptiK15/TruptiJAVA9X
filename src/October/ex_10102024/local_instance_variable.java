package October.ex_10102024;

public class local_instance_variable {
    //instance variable = declared outside the class
    //default values are added in Instance & Static by JVM
    //Default value = 0;
    int a1;           //default - 0
    static int a2;
    static short a3;           //default - 0
    static byte a4;           //default - 0
    static double a5;           //default - 0.0
    static float a6;           //default - 0.0
    static char a7;           //default - 0
    static String a8;           //default - null

    public static void main(String[] args) {

        //local variable = declared inside the class
        //default value are not added we need to assign value to local variable
        int age;
        age = 22;
        System.out.println(age);
        //Only Static variable is allowed in static main class

        // System.out.println("Instance Variable" + a1);   //instance variable
        System.out.println("int default value :" + a2);
        System.out.println("short default value :" + a3);
        System.out.println("byte default value :" + a4);
        System.out.println("double default value :" + a5);
        System.out.println("float default value :" + a6);
        System.out.println("Char default value :" + a7);
        System.out.println("String default value :" + a8);
    }
}
