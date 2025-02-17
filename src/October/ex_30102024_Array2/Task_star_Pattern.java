package October.ex_30102024_Array2;

public class Task_star_Pattern {
    public static void main(String[] args) {
        /* Left Triangle Star Pattern
         *****
         ****
         ***
         **
         *
         */

        for (int i = 5; i > 0 ; i--){
            for (int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
