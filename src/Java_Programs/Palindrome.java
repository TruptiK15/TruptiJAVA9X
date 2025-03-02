package Java_Programs;

public class Palindrome {
    public static void main(String[] args) {

        //Palidrome of String
        //input = naman , O/P true.
        //madam, dad, wow, mom, malayalam, pop
        String str = "madam";
        String reverse_str = "";

        int strlen = str.length();
        System.out.println(strlen);

        for (int i = (strlen-1); i >=0; --i){
            reverse_str = reverse_str + str.charAt(i);
        }
        if (reverse_str.equals(str)){
            System.out.println(reverse_str + " is a Palindrome String");
        }else{
            System.out.println(reverse_str + " is not a Palindrome String");
        }

    }
}
