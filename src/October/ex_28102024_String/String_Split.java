package October.ex_28102024_String;

public class String_Split {
    public static void main(String[] args) {

        //delimter - Split
        String fruits = "apple,cherry,banana";
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);    //index split
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        //delimter - Split
        String aplabets = "ABC-XYZ-MNO";
        String[] split_aplabets = aplabets.split("-");
        System.out.println(split_aplabets[0]);    //index split
        System.out.println(split_aplabets[1]);
        System.out.println(split_aplabets[2]);

        //regex - to extract information from string
    }
}
