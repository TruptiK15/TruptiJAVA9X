package October.ex_23102024_Function;

public class Function_User_WOP_WRT {
    public static void main(String[] args) {

        // 2. Without Parameters and With return type
        int voting_age = verify_age();
        if (voting_age >= 18) {
            System.out.println("Allowed to Vote..");
        } else {
            System.out.println("Not allowed to Vote..");
        }
    }

    // 2. Without Parameters and With return type
    static int verify_age() {
        System.out.println("Can I vote..?");
        return 18;
    }
}
