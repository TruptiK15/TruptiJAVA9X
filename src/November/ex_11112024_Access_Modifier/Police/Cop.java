package November.ex_11112024_Access_Modifier.Police;

//Access modifiers are visibility - public, private and protected
//Public - accessible by All
public class Cop {

    //private - only accessible within same class (restricted)
    private int gun;
    public String iCard;

    //Parameterized constructor
    public Cop(int gun) {
        this.gun = gun;
    }

    //method - No Return no argument
    //protected - allowed within package (to all classes within package)
    protected void canIshoot(){
        System.out.println("Yes, You can..!!");
    }
}
