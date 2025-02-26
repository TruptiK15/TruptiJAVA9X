package Java_Programs;

import java.util.HashSet;

public class Duplicate_Array {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,1,2};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int number : numbers){
            if (!seen.add(number)){
                duplicate.add(number);
            }
        }
        System.out.println("Duplicate No : " + duplicate);
    }
}
