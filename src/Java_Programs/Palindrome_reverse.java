package Java_Programs;

import java.util.Scanner;

public class Palindrome_reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine().trim();
        sc.close();

       String reverse_string = new StringBuilder(str).reverse().toString();
        if (reverse_string.equalsIgnoreCase(str)){
            System.out.println(reverse_string + " is a Palindrome String");
        }
        else {
            System.out.println(reverse_string + " is not a Palindrome String");
        }
    }
}
