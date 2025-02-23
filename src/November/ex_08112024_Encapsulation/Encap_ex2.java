package November.ex_08112024_Encapsulation;

public class Encap_ex2 {
    public static void main(String[] args) {

        Person p1 = new Person("Trupti","+91 9090");
        p1.getName();
        p1.setName("Amey");
        String newname = p1.display();
        System.out.println(newname);
    }
}
class Person{
    private String name;
    private String phone;
    //If private we can only use them using getter setter

    Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

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
    String display(){
        return "Name : " + this.name + " , " + "Phone : " + this.phone;
    }
}
