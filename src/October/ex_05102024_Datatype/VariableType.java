package October.ex_05102024_Datatype;

public class VariableType {

    //Instance Variable
    int age = 30;

    //Static variable
    static int age1 = 18;

    public static void main(String[] args) {

        //Local Variable
        int age2 = 88;

    //  System.out.println(age);    //non static (instance) variable cannot be accessed
        System.out.println(age1);
        System.out.println(age2);
    }
}
