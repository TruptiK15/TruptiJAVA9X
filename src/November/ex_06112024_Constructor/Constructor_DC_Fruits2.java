package November.ex_06112024_Constructor;

public class Constructor_DC_Fruits2 {
    public static void main(String[] args) {

        //Default Constructor
        Fruits1 fru1 = new Fruits1();
        fru1.name = "Kiwi";
        fru1.quanity = 4;
        System.out.println(fru1.name + " , " + fru1.quanity);

        Fruits1 fru2 = new Fruits1();   //not values assigned so default value will be replaced here
        System.out.println(fru2.name + " , " + fru2.quanity);
    }
}
