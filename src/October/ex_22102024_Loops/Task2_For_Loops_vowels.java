package October.ex_22102024_Loops;
public class Task2_For_Loops_vowels {
    public static void main(String[] args) {

        //Count vowels and consonants in a String_ex1.
        String str = "this is a simple sentence";
        System.out.println(str + " - " + str.length());
        int vowelcount = 0;
        int consonantscount = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'o' ||ch == 'i' ||ch == 'u'){
                vowelcount++;
            }   else if (ch >= 'a' && ch <= 'z'){
                consonantscount++;
            }
        }
        System.out.println("Vowels count: " + vowelcount);
        System.out.println("Consonants count: " + consonantscount);
    }
}
