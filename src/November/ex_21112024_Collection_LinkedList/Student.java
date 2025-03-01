package November.ex_21112024_Collection_LinkedList;

public class Student {

    private String name;    //encapsulation
    private String rollno;

    //create constructor
    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    //generate getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollno() {
        return rollno;
    }
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    public void printdisplays(){
        System.out.println("Student :" + this.name);
        System.out.println("Rollno :" + this.rollno);
    }
}
