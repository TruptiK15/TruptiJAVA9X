package November.ex_05112024_OOPS;

public class Oops_Class_Object_ex2 {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.name="Tom";
        c1.sleep();
        System.out.println();
    }
}
    class Cat{  //Class
        String name;

        void sleep(){   //method
            System.out.println("Name : " + name);
            System.out.println("All Day sleep..");
        }
    }
