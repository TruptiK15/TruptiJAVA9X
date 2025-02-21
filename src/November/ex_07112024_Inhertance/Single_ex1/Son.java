package November.ex_07112024_Inhertance.Single_ex1;

public class Son extends Father {

    void Son_3BHK(){
        System.out.println("Sons has 3BHK");

        //Son can access Father class - call method and variables
        System.out.println("Father gold : " + father_gold);
        father_2BHK();
    }
}
