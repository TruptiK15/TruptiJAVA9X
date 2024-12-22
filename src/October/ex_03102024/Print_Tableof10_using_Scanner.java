package October.ex_03102024;

import java.util.Scanner;

public class Print_Tableof10_using_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        int no = sc.nextInt();

        System.out.println(no + " * 1 = "+(no * 1));
        System.out.println(no + " * 2 = "+(no * 2));
        System.out.println(no + " * 3 = "+(no * 3));
        System.out.println(no + " * 4 = "+(no * 4));
        System.out.println(no + " * 5 = "+(no * 5));
        System.out.println(no + " * 6 = "+(no * 6));
        System.out.println(no + " * 7 = "+(no * 7));
        System.out.println(no + " * 8 = "+(no * 8));
        System.out.println(no + " * 9 = "+(no * 9));
        System.out.println(no + " * 10 = "+(no * 10));
        sc.close();
    }
}
