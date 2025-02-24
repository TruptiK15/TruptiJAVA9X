package November.ex_12112024_Super_Abstraction;

public class Abstraction_ex2 {

    public static void main(String[] args) {

        Child c = new Child();
        c.loan50k();    //child - //here Father class is hidden
        c.loan20k();    //Father method is call
        //Abstraction
    }
}
//if abstract method then class should be also abtract
abstract class Father{
    abstract void loan50k();

    void loan20k(){
        System.out.println("20K Paid by Father..");
    }
}
class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Child is giving 50k loan..");
    }
}