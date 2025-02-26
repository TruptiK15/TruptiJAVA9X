package Java_Programs;

public class Array_Sum {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all Array is " + sum);

    }
}
