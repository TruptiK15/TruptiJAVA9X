package November.ex_12112024_Super_Abstraction;

public class Multiple_Inhertance {
    //In Interface, object is never created
    // so no constructor created

}
//Multiple Inhertance
class Child1 implements Father1,Mother1{
    //need to implement all the methods

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }

    @Override
    public void same() {    //same function in Father & Mother
        System.out.println("1 only same");
    }
}
interface Father1{
    void f1();
    void f2();
    void same();
}
interface Mother1{
    void f3();
    void f4();
    void same();
}