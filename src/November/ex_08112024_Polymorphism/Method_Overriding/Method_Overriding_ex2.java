package November.ex_08112024_Polymorphism.Method_Overriding;

public class Method_Overriding_ex2 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.home();

        Father s2 = new Father();
        s2.home();

        //Dynamic Dismatch
        Father s3 = new Son();
        s3.home();
        //WebDriver driver = new ChromeDriver();
    }
}
class Father{
    void home(){
        System.out.println("2BHK");
    }
    void F1(){}
}
class Son extends Father {

    //Upgrade my Father home
    @Override
    void home(){
        System.out.println("3BHK...Son");
    }
    void F2(){}
}