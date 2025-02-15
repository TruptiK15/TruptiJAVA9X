package October.ex_18102024_Switch;
import java.util.Scanner;

public class Switch_Statement2 {
    public static void main(String[] args) {
        /* Web Automation
        i will ask user which browser you want to run the code
        chrome - execute chrome
        firefox - execute firefox
        edge - execute edge

        //case sensitivity not handle - so use string method .toLowerCase();
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser..");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("---------------------------------------");
                System.out.println("TC");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("---------------------------------------");
                System.out.println("TC");
                break;
            case "edge":
                System.out.println("Starting the edge");
                System.out.println("---------------------------------------");
                System.out.println("TC");
                break;
            case "safari" :
                System.out.println("Starting the Safari");
                System.out.println("---------------------------------------");
                System.out.println("TC");
                break;
            default:
                System.out.println("invalid browser");
                break;
        }
        sc.close();
    }
}
