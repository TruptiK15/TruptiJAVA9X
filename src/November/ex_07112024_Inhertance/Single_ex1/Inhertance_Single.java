package November.ex_07112024_Inhertance.Single_ex1;
public class Inhertance_Single {

    // Inheritance -  one class inherits the properties and behavior of another class
    //use extends keyword

    public static void main(String[] args) {
        //Single Inheritance -  child will get attribute from parent (only 1 child)
        Son s1 = new Son();
        s1.Son_3BHK();

        System.out.println(s1.father_gold);
        s1.father_2BHK();
    }
}