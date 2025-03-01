package November.ex_21112024_Collection_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Class {
    public static void main(String[] args) {

        //List of Students
        Student s1 = new Student("Trupti", "1");
        Student s2 = new Student("Amey", "2");
        Student s3 = new Student("Sneha", "3");

        //Store them into ArrayList
        List<Student> mystudents = new ArrayList<>();   //Store Student
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);

        s1.printdisplays();
        s2.printdisplays();
        s3.printdisplays();
        //System.out.println(mystudents.addAll(mystudents));

        //set - 28
    }
}
