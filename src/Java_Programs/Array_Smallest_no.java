package Java_Programs;

public class Array_Smallest_no {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};
        int min = numbers[0];   //min = 1

        for (int number : numbers){
            if (number < min){
                min = number;
            }
        }
        System.out.println("Smallest no in Array is " + min);
    }
}
