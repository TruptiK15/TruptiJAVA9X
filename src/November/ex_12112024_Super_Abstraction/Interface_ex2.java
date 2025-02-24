package November.ex_12112024_Super_Abstraction;

public class Interface_ex2 {
    public static void main(String[] args) {
        P1 p1 = new P1();
        p1.f1();
    }
}
class P1 implements I1{
    //to implement I1 i have complete all below methods
    @Override
    public void f1() {
        System.out.println("F1 method");
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}
interface I1{
    void f1();  //incomplete - i.e., abstract
    void f2();
    void f3();
}