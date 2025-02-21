package November.ex_06112024_Constructor;

public class Task_Constructor {
    public static void main(String[] args) {

        Students s1 = new Students();   //default Constructor
        s1.display();

        Students s2 = new Students("Kiara", 10);   //Parameterized Constructor
        s2.display();
    }
}

class Students {
    String name;
    int rollno;

    Students() {    //default Constructor
        name = "Trupti";
        rollno = 6;
        System.out.println("---Default Constructor called-----");
    }
    // Parameterized constructor
    Students(String student_name, int student_rollno) {
        this.name = student_name;
        this.rollno = student_rollno;
        System.out.println("---Parameterized Constructor Called----");
    }
    void display(){
        System.out.println("Student Name: " + name + ", Rollno: " + rollno);
    }

}

