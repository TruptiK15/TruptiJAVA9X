package November.ex_14112024_Static_Keyword;
public class IIB_SIB {
    public static void main(String[] args) {

        Student s1 = new Student(20); //IIB will executed everytime you create object
        Student S2 = new Student(30);
    }
}
class Student{
    int age;    //non-static or instance variable (access by creating an object)

    //Parameterized constructor
    public Student(int age) {
        this.age = age;
    }

    //IIB - Instance Intialization block
    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want");
        System.out.println("Read a MySQL db()");
    }
    //SIB -  Static Intialization block - Loaded only once
    static {
        System.out.println("SIB");
        System.out.println("Loaded once, when class is loaded..");
        System.out.println("Read excel file..");
    }
}
