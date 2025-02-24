package November.ex_12112024_Super_Abstraction;

public class Interface {
    /* ----Interface------
    - can be used to create multiple inheritance
    - variables declared are public
    - methods declared are also public
     */
}

abstract class ABC{
    abstract void m1();

    void m2(){
        System.out.println("Complete Method..");
    }
}
interface I{
    void m1();  //bydefault incomplete - no need of abstract keyword
    void m2();
    //interface cannot have complete function

    default void m3(){  //for complete function use default keyword in interface
        System.out.println("Default method in Interface");
    }
    static void m4(){  //for complete function use default keyword in interface
        System.out.println("Static method in Interface");
    }
}
