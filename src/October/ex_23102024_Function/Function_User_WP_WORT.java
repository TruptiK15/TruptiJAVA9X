package October.ex_23102024_Function;

public class Function_User_WP_WORT {
    public static void main(String[] args) {

        // 3. With Parameters and without return type
        greet_with_name("Trupti");
        greet_with_name("Amey");
        greet_with_firstname_lastname("Trupti","Keni");
        greet_with_firstname_lastname("Amey","Keni");
    }

    // 3. With Parameters and without return type
    static void greet_with_name(String name) {
        System.out.println("Hii..Your name is.." + name);
        //void doesn't have return type
        //we have to pass parameter
    }

    static void greet_with_firstname_lastname(String firstname, String lastname) {
        System.out.println("I am " + firstname + " " + lastname);
    }
}
