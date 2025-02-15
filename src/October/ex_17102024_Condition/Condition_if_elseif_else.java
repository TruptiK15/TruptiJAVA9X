package October.ex_17102024_Condition;
public class Condition_if_elseif_else {
    public static void main(String[] args) {

        /* Condition & Loops_For - Decision Maker in the programming
            1. If-elseif-else condition
            Syntax - if(condition 1){
            //code to be executed if condition is true
            }elseif(condition 2){
            //code to be executed if condition is true
            }else{
            }
        */
        int num1 = 30;
        int num2 = 15;
        if (num1 > num2) {
            System.out.println("num1 is greater...");
        } else if (num2 > num1) {
            System.out.println("num2 is greater...");
        } else {
            System.out.println("Equal");
        }
    }
}
