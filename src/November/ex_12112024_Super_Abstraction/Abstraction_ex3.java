package November.ex_12112024_Super_Abstraction;

public class Abstraction_ex3 {

    public static void main(String[] args) {
        //Abstraction
        Wagnor w = new Wagnor();
        w.drive();  //class wagnor drive method

        Tesla t = new Tesla();
        t.drive();  //class tesla drive method
    }
}

class Wagnor extends Engine{

    void drive(){
        startengine();  //call methods
        stopengine();
    }
    @Override
    void startengine() {
        System.out.println("Starting Engine..");
    }

    @Override
    void stopengine() {
        System.out.println("Stoping Engine..");
    }
}
//if final keyword is use then it is a complete class
abstract class Engine{
    abstract void startengine();
    abstract void stopengine();
}
//Abstract class - object cannot be created as it is incomplete in nature