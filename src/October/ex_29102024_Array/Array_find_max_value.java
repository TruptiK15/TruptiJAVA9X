package October.ex_29102024_Array;

public class Array_find_max_value {
    public static void main(String[] args) {

        int[] array1 = {25, 4, 56, 15, 36, 66, 77, 18, 29, 49};
        System.out.println("Array length : " + array1.length);

        int max_value = give_max(array1);
        System.out.println("Max Value is : "+ max_value);
    }
    static int give_max(int[] array1){
        //Arrays.sort(array1);
        int max = array1[0];    //25
        for (int i = 0; i < array1.length; i++){
            if (array1[i] > max){
                max = array1[i];
            }
        }
        return max;
    }
}
