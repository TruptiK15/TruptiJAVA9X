package November.ex_08112024_Encapsulation;

public class Encapsulation {
    /* ----------Encapsulation------
        - biding data (attribute) and methods (function) into single unit
        - hide datatype and variables and give control access and have access by methods
        - Private, Protected and Public
     */

    public static void main(String[] args) {

        VWOLogin vwo = new VWOLogin("admin", "password123");
        System.out.println(vwo.username);

        //password get changed due to public - not encapsulated (not secured)
        vwo.password = "hacker";
        System.out.println("Password changed : " + vwo.password);
        System.out.println("----------------------------------------------");

        goodVWOLogin vwo1 = new goodVWOLogin("admin", "Admin@123");
        // vwo1.password = "hacker";
        // System.out.println(vwo1.password);
        // ------cannot print or change private variables
        String pass = vwo1.GivemePassword(true);
        System.out.println(pass);
        //we can access, call functions having private variables (security added)

        System.out.println("----------------------------------------------");
        //set password using getter setter
        String pass1 = vwo1.getPassword(true);
        vwo1.setPassword("hacker123", true);
        System.out.println(pass1);
    }
}

class VWOLogin {
    public String username;
    public String password;

    VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class goodVWOLogin {
    //mark variable as private
    //only access within class
    private String username;
    private String password;

    goodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String GivemePassword(Boolean IsAuth) {
        if (IsAuth) {    //added security
            return username;
        }
        return "None";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean IsAdmin) {
        if (IsAdmin) {
            return password;
        } else {
            return "None";
        }
    }

    //if we delete this setPassword then no one will be able to set the password`
    public void setPassword(String password, boolean IsAdmin) {
        if (IsAdmin) {
            this.password = password;
        } else {
            System.out.println("Not Allowed");
        }
    }
}
