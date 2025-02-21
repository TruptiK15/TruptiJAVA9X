package November.ex_05112024_OOPS;

public class Oops_Class_Object {
    public static void main(String[] args) {

        //Student_ATB() -  class loading
        //s1 = object reference
        //new --> new memory
        //After new Student_ATB() --> actual Object creation
        Student_ATB s1 = new Student_ATB();
        s1.name = "Trupti";     //access attribute
        s1.eat(10);     //access behavior
        System.out.println(s1);

        Student_ATB s2 = new Student_ATB();
        s2.name = "Amey";     //access attribute
        s2.eat(20);     //access behavior
        System.out.println(s2);
    }
}
