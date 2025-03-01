package November.ex_20112024_Collection_List;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";
        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.println("Enter name : ");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter age : ");
            int age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record? Y/N : ");
            continueInput = sc.nextLine();
        }
        System.out.println("Names : " + names);
        System.out.println("Ages : " + ages);

        /* for (Object o = names) {
            System.out.println(o);
        }*/
    }
}
