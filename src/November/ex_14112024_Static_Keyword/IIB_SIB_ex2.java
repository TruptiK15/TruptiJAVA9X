package November.ex_14112024_Static_Keyword;
public class IIB_SIB_ex2 {
    public static void main(String[] args) {
        ATB a1 = new ATB("Trupti");
        ATB a2 = new ATB("Amey");
        a1.redDocument();
        ATB.doAssignment(); //Static method - direct access
        System.out.println(ATB.course); //Static variable- direct access
    }
}
class ATB{

    ATB(String name) {
        this.name = name;
    }

    //IIB
    {
        System.out.println("IIB");
    }
    //sIB
    static {
        System.out.println("SIB");
    }

    private String name;
    private String phone;
    static String course = "ATB9x"; //common function
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    void redDocument(){
        System.out.println("Non static method");
        System.out.println(course);
    }
    static void doAssignment(){
        //System.out.println(phone);  //cannot access non static variable
        System.out.println("Do Assignment");
    }
}