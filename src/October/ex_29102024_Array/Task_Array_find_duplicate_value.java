package October.ex_29102024_Array;

public class Task_Array_find_duplicate_value {
    public static void main(String[] args) {

        int[] numbers = {10, 55, 4, 2, 10, 55, 11, 44};
        duplicateno(numbers);
    }

    public static void duplicateno(int[] arr) {
        System.out.println("Duplicate numbers : ");
        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " ");
                    hasDuplicate = true;
                    break;
                }
            }
        }
        if (!hasDuplicate){
            System.out.println("None");
        }

    }
}
