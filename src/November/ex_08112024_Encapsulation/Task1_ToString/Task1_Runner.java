package November.ex_08112024_Encapsulation.Task1_ToString;

public class Task1_Runner {
    public static void main(String[] args) {

        //create Student Array
        ATBStudent[] atb = new ATBStudent[3];

        //Instantiate each StudentATB (s1, s2, s3)
        atb[0] = new ATBStudent(1, "Trupti");
        atb[1] = new ATBStudent(2, "Amey");
        atb[2] = new ATBStudent(3, "Sneha");

        // Display student details using toString()
        for (ATBStudent atbdisplay : atb){
            System.out.println(atbdisplay.toString());
        }

        // Show examples of method overloading
        atb[0].displayDetails();
        atb[0].displayDetails("Extra Info.. None");

    }
}
