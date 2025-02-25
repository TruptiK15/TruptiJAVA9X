package November.ex_14112024_Enum;

public class Enum_ex3 {
    public static void main(String[] args) {

        System.out.println(Colors.RED.getHexcode());

        if (Colors.YELLOW.getHexcode() == "#4477FF") {
            System.out.println("Color is Yellow");
        }
    }
}
enum Colors{

    RED("#FF0000"),
    YELLOW("#4477FF");

    private String hexcode;

    Colors(String hexcode) {
        this.hexcode = hexcode;
    }
    String getHexcode(){
        return this.hexcode;
    }
}