package Java_Programs;

public class Largest_no_Array {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int max = numbers[0];

        for (int number : numbers){
            if ( number > max){
                max = number;
            }
        }
        System.out.println("Largest no in Array is : "+ max);
    }
}
