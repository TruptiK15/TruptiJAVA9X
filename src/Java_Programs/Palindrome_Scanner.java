package Java_Programs;

import java.util.Scanner;

public class Palindrome_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine().trim();
        String reverse_string = "";
        sc.close();

        int str_length = str.length();

        for (int i = (str_length - 1); i >=0 ; i--){
            reverse_string = reverse_string + str.charAt(i);
        }
        if (reverse_string.equals(str)){
            System.out.println(reverse_string + " is a Palindrome String");
        }
        else {
            System.out.println(reverse_string + " is not a Palindrome String");
        }
    }
}
