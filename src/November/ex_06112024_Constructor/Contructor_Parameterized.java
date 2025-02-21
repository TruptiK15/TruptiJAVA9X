package November.ex_06112024_Constructor;

import java.util.Scanner;

public class Contructor_Parameterized {

    //-------Parameterized Constructor----
    //allows you to pass the value when creating an object
    //this - reference value which represent current object

    public static void main(String[] args) {
        Car2 t1 = new Car2("tesla",2015);   //pass values
        System.out.println(t1.model);
        System.out.println(t1.year);

        Car2 t2 = new Car2("nano",2012);   //pass values
        System.out.println(t2.model);
        System.out.println(t2.year);

        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Enter the model name : ");
        String model_name_input = sc.next();

        System.out.println("Enter the year : ");
        int year_input = sc.nextInt();

        Car2 t3 = new Car2(model_name_input,year_input);
        System.out.println(t3.model);
        System.out.println(t3.year);
        sc.close();
    }
}
class Car2 {
    String model;
    int year;

    Car2(String model_name,int year_created){    //Parameterized constructor - same name as class name
        System.out.println("--PC--");
        this.model = model_name;
        this.year = year_created;
    }
}