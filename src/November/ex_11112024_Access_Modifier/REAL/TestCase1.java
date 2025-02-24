package November.ex_11112024_Access_Modifier.REAL;

public class TestCase1 extends BaseClass{

    public TestCase1(){
        super();    //to call parent constructor
        //this - current object
        System.out.println("DC - TC1");
    }

    public void startTC1(){
       OpenBrowser("chrome");
       CloseBrowser();
    }

    @Override
    public void setBrowser(String browser, Boolean isAuth) {
        System.out.println("Own Logic..");
        super.setBrowser(browser, isAuth);
        //to call parent method
    }
}
