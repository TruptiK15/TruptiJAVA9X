package November.ex_08112024_Polymorphism.Method_Overloading;

public class Poly_Method_Overloading {

    public static void main(String[] args) {

        MathOperation m1 = new MathOperation();
        int result = m1.add(5, 2);
        System.out.println(result);

        float result1 = m1.add(5.5f, 2);
        System.out.println(result1);

        double result2 = m1.add(777.6, 90.55555);
        System.out.println(result);

        m1.add(1,2,3);
        //match with datatype and arguments
    }
}

class MathOperation {

    //--------Method Overloading----------
    // - same method name but different arguments (Parameters)
    int add(int a, int b) {
        return a + b;
    }
    float add(float a,float b){
        return a + b;
    }
    void add(int a, int b, int c){
        System.out.println("Hello........");
    }
    double add(double a, double b){
        return a + b;
    }
}