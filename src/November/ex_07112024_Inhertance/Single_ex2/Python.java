package November.ex_07112024_Inhertance.Single_ex2;

public class Python extends Programming {

    Python() {
        System.out.println("Python DC called........");
        version = 2;
    }

    public static void main(String[] args) {
        Python p1 = new Python();
        p1.print();
    }

    void print() {
        System.out.println(author);
        System.out.println(version);
    }
}
