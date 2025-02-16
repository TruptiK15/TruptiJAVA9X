package October.ex_22102024_Loops;

public class Loops_while_ex3_reverse {
    public static void main(String[] args) {

        //Exercise - Age reverse
        //Take input
        //1. Arguments      - this is always string
        //2. Scanner class
        //3. BufferReader

        //Take user input for the age and print the output
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter age : ");
        //int age = sc.nextInt();
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println("Age: " + age);

        while (age >= 1) {
            System.out.println(age);
            age--;
            //it will print from age to 1
        }
    }
}
