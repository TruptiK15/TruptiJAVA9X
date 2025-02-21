package November.ex_06112024_Constructor;

public class Contructor_default {

    /*-------Constructor----
        - They are special methods
        - used to initialize objects when they are created
        - have same name as a class name and do not have return type

        Type of Constructor
        1. Default Constructor
        2. Parameterized Constructor
     */
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println("Name : " + tesla.name);     //displays default value of constructor
        System.out.println("Model : " + tesla.model);
        System.out.println("Year : " + tesla.year);
        System.out.println("-----------------------------");

        Car nano = new Car();
        nano.name = "Tata Nano";       //DC Value updated - so Unknown name is replace by Tata Nano
        System.out.println("Name: " + nano.name);
    }
}
