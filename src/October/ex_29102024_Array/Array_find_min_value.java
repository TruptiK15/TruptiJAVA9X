package October.ex_29102024_Array;

public class Array_find_min_value {
    public static void main(String[] args) {

        int[] array1 = {25, 14, 56, 15, 36, 4, 77, 18, 29, 49};
        System.out.println("Array Length : " + array1.length);

        int min_value = give_min(array1);
        System.out.println("Min Value : " + min_value);
    }
    static int give_min(int[] array1){
        //Arrays.sort(array1);
        int min = array1[0];
        for (int i = 0; i < array1.length; i++){
            if (array1[i] < min){
                min = array1[i];
            }
        }
        return min;
    }
}
