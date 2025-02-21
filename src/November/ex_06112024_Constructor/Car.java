package November.ex_06112024_Constructor;

public class Car {
    String model;
    String name;
    int year;

    //Default Constructor - no argument no return type
    // - same as class name
    Car(){
        name = "Unknown";   //if no values assign display this default values
        model = "XYZ";
        year = 0;
        System.out.println("DC is executed...");
    }
}
