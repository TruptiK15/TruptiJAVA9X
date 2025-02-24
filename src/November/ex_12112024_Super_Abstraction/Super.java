package November.ex_12112024_Super_Abstraction;

public class Super {
    /*-----Super Keyword-----
        - it is a reference variable that allows a subclass
        - child class is reference to paremt class

        - use of super with variable
        - use of super with Methods
        - use of super with constructor
     */
    public static void main(String[] args) {
        Car c = new Car();

    }
}
class Car extends Vehicle{
    private int maxSpeed = 281;

        @Override
        void display() {
            System.out.println("Child");
        }
        //constructor
        Car(){
            super();   //to call parent constructor
            System.out.println("DC Car");
            System.out.println(this.maxSpeed);  //calls cars maxspeed
            System.out.println(super.maxSpeed);  //calls vehicle maxspeed
            //because of super keyword it will call vehicle maxspeed
            this.display();     //car - child
            super.display();    //vehicle - parent
        }
    }

class Vehicle{
    public int maxSpeed = 180;

    void display(){
        System.out.println("Parent");
    }
    //constructor
    Vehicle() {
        System.out.println("DC Vehicle");
    }

    Vehicle(int maxSpeed) {
        System.out.println("PC Vehicle");
        this.maxSpeed = maxSpeed;
    }

    //method overloading - same name but different arguments
    void message(){
        System.out.println("Hello Vehicle");
    }
    void message(int a){
        System.out.println("Hello Vehicle");
    }

}
