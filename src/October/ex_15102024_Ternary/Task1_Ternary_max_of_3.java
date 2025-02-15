package October.ex_15102024_Ternary;

public class Task1_Ternary_max_of_3 {
    public static void main(String[] args) {

        //Nested Ternary
        //Task 1 - Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
        //Syntax --> result = condition1 ? expression1 : condition2 ? expression2 : expression3
        int x = 10;
        int y = 50;
        int z = 30;
        int max = (x > y && x > z) ? x : (y > z) ? y : z;
        System.out.println(max);
    }
}
