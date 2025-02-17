package October.ex_22102024_Loops;

public class Task1_For_Loops_reverse_no {
    public static void main(String[] args) {
        /* For Loop -
        Task 1: Reverse the number using for loop. (In - 12345, Out - 54321)
        Logic - (In - 12345, Out - 54321)
            1. A for loop runs as long as num is not 0:
            2. Extracts the last digit using num % 10
            3. Appends it to reversed
            4. Removes the last digit using num /= 10
        */
        //Declare the variable
        int no = 12345;
        int rev = 0;
        System.out.println("No :" + no);
        //Initialize as no is not equal to 0
        for (; no != 0; ) {
            int num = no % 10;
            rev = rev * 10 + num;
            no = no / 10;
        }
        System.out.println("Reverse No: " + rev);
    }
}
