package November.ex_08112024_Polymorphism.Method_Overriding;

public class Poly_Method_Overriding {
    public static void main(String[] args) {

        Hound h1 = new Hound();
        h1.bark();
        //which bark method will it call from Hound or Dog
        //it will call local i.e., Hound
        //only 1 bark will execute as it is overrided
    }
}
class Dog{
    int age = 3;
    void bark(){
        System.out.println("I am a Dog, i will Bark..");
    }
}
class Hound extends Dog{

    //same name of parent and child class
    @Override
    void bark(){
        System.out.println("Bark of Hound..");
    }
}