package October.ex_22102024_Loops;

public class Loops_Do_while {
    public static void main(String[] args) {
        /* Loop - repeat a block of code
        - Do While Loop -  first execute code & then check condition
                initialization
                    do{
                     //block of code
                       updation
                    }while(Condition)
            In while - condition is check & then enter loop
            In Do while - we enter loop first & then check consition
        */
        int i = 1;
        do {
            System.out.println("Run the code --> " + i);
            i++;
        } while (i < 10);
    }
}
