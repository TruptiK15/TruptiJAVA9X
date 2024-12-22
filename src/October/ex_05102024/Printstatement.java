package October.ex_05102024;

public class Printstatement {
    public static void main(String[] args) {

        int age = 18;
        String name = "trupti";

        System.out.print(age);  //not using ln (nextline)
        System.out.println("Your age : " + age);
        System.out.printf("Your age is %d", age);   //printf

        System.out.print(name); //not using ln (nextline)
        System.out.println("Your name : " + name);
        System.out.printf("Your name is", name);   //printf

        //%d --> int
        //%s --> string
        //%f --> float
        //%b --> boolean
    }
}
