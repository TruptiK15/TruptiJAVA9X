package November.ex_14112024_Static_Keyword;

public class Static_keyword {
    /*----Static-------
        - it is a keyword
        - non-access modifier used to indicate particular member(method/variable)
        - it can be a method or a variable or a block or a class
        //without creating any object we can access the static method / class / variable
     */
    public static void main(String[] args) {

        //static variable can be access directly without object
        System.out.println(Student1.school_name);
        Student1.school_name = "Expert International..";
        System.out.println(Student1.school_name);

        System.out.println(Student1.rollno);

    }
}
class Student1{
    int age;    //non-static or instance variable (access by creating an object)
    static String school_name = "ABC";
    static int rollno = 1;

    public Student1(int age) {
        this.age = age;
    }
}
//All commmon method and variables should be static