package November.ex_07112024_Inhertance.Single_ex3_Real;

public class Common_BaseTest {
    public Common_BaseTest() {
        System.out.println("- DC - Parent");
    }

    //All common Functions
    void startBrowser(){
        System.out.println("Starting Browser......");
    }
    void closeBrowser(){
        System.out.println("Closing Browser......");
    }
    void readExcelFile(){
        System.out.println("Read File......");
    }
}
