package November.ex_06112024_Constructor;

public class Constructor_overloading {
    public static void main(String[] args) {

        Car3 c1 = new Car3();   //default constructor
        c1.display();

        Car3 c2 = new Car3("KN", 2024);     //Parameterized constructor with 2 values
        c2.display();

        Car3 c3 = new Car3("BMW");   //Parameterized constructor with 1 value
        c3.display();
    }
}
class Car3{
    String name;
    int year;

    Car3(){
        System.out.println("--------Default---------");
        name = "Tata";
        year = 2020;
    }
    Car3(String car_name, int car_year){
        System.out.println("--------Parameterized with 2 values---------");
        this.name = car_name;
        this.year = car_year;
    }
    Car3(String car_model){
        System.out.println("--------Parameterized with 1 value---------");
        this.name = car_model;
    }
    void display(){
        System.out.println("Name : " + name + " , " + "Year : " + year);
    }
}