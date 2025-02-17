package October.ex_29102024_Array;

public class Array_Intro {
    public static void main(String[] args) {

        /* Array - collection of data with similar datatype
        - Homogenous data structure
            - For Each (Array)
            - Nested for loop (Array)
               - star pattern
               - Right angled triangle
        */

        // Array index - 0 to 6
        int[] marks = {50, 11, 42, 77, 90, 2, 22};
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //System.out.println(marks[10]);  //ArrayIndexOutOfBoundsException
        System.out.println(marks.length);
    }
}
