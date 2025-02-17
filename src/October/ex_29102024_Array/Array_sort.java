package October.ex_29102024_Array;

import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {

        int[] marks = {22, 55, 3, 17};
        System.out.println("Array length : " + marks.length);
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        //System.out.println(marks[3]);

        for (int i = 0; i <= marks.length; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        //binarysearch requires sorted array
        int item_marks = Arrays.binarySearch(marks, 55);
        System.out.println(item_marks);
    }
}
