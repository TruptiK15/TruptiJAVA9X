package November.ex_07112024_Inhertance.MultiLevel;

public class MultiLevel {
    public static void main(String[] args) {

        Child c1 = new Child();
        c1.gf_money();
        c1.father_money();
        c1.child_money();
        c1.home();
        //home is present in Grandfather, Father and child but it will print the latest one i.e., child

        Father f1 = new Father();
        f1.home();

        GrandFather gf = new GrandFather();
        gf.home();
    }
}
