package November.ex_08112024_Encapsulation.Task1_ToString;

public class ATBStudent {

    String sname;
    int sid;

    public ATBStudent(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
    // Override toString() from Object
    @Override
    public String toString() {
        return "Student Name: " + sname + ", ID: " + sid;
    }

    // Overloading: display with different parameters
    public void displayDetails() {
        System.out.println("Display Student Name: " + sname);
    }

    public void displayDetails(String extraInfo) {
        System.out.println("Display Student name: " + sname + ". Info: " + extraInfo);
    }
}
