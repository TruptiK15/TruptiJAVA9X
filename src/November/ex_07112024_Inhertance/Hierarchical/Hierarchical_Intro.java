package November.ex_07112024_Inhertance.Hierarchical;

public class Hierarchical_Intro {

    /* ---------Hierarchical-------
    - Multiple derived class inherits from a single class
    - Father - Home --> divided into multiple sons (Amey, Aman, Jeet)
    - useful common functions - i.e., basecase
    */

    public static void main(String[] args) {

        Daughter_Trupti d1 = new Daughter_Trupti();
        d1.trupti_home();
        d1.father_home();

        Son_Aman s1 = new Son_Aman();
        s1.aman_home();
        s1.father_home();

        Son_Amey s2 = new Son_Amey();
        s2.amey_home();
        s2.father_home();

        Father f1 = new Father();
        f1.father_home();

    }
}
