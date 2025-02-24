package November.ex_12112024_Super_Abstraction;

public class Abstraction {
    /* ---- Abstraction----------
    - Abstract - is a method or a class
    - hiding important features
    - if class doesn't have abtract class then it is concrete class
     */

}
//abstract have incomplete methods
abstract class Loan{
    abstract void loan50k();    //only declaration not defination
    abstract void loan30k();
    //only show the method name
    //but its code is in another class

    void loan1L(){
        System.out.println("1L loan is there");
    }
}

class Trupti extends Loan{
    @Override
    void loan50k() {
        System.out.println("Giving the 50k loan");
    }

    @Override
    void loan30k() {
        System.out.println("Giving the 30k loan");
    }
}

//concrete class -  complete class
class Person{}
