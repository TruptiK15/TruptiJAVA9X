package October.ex_30102024_Array2;

import java.util.Scanner;

public class Array_2D_Right_Triangle {
    public static void main(String[] args) {

        /* Right angle Triangle Star Pattern
         *
         **
         ***
         ****
         *****
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
