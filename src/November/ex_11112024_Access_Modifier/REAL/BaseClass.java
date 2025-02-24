package November.ex_11112024_Access_Modifier.REAL;

//Common function - Single inheritance
public class BaseClass {

    private String browser;     //don't make instance variable as public

    //Default constructor
    BaseClass() {
        System.out.println("DC - BaseClass");
    }
    //PC constructor
    BaseClass(String browser) {
        System.out.println("PC - BaseClass");
    }

    public String getBrowser() {
        return browser;
    }
    //Encapsulation
    public void setBrowser(String browser, Boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }
    //default is same as protected
    void OpenBrowser(){
        System.out.println("Opening Browser..");
    }
    //method overloading - same name but different arguments
    void OpenBrowser(String browsername){
        System.out.println("Open Browser.." + browsername);
    }
    void CloseBrowser(){
        System.out.println("Closing Browser..");
    }
}
