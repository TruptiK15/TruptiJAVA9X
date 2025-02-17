package October.ex_29102024_Array;

public class Array_int {
    public static void main(String[] args) {

        // Array Creation
        int[] marks = new int[5];   //Fixed size
        System.out.println(marks.length);
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        System.out.println(marks[4]);
        //System.out.println(marks[10]);    //ArrayIndexOutOfBoundsException
        //System.out.println(marks[-4]);    //ArrayIndexOutOfBoundsException
    }
}
