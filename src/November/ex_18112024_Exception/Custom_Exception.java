package November.ex_18112024_Exception;

public class Custom_Exception {
    public static void main(Strings[] args) throws Exception {

        //Add 2 bank amount with same currency
        Bank sbi = new Bank("INR", 10);
        Bank hdfc = new Bank("INR", 50);
        System.out.println(sbi.add(hdfc));

        //Add 2 bank amount with different currency
        Bank jpchase = new Bank("USD", 10);
        System.out.println(sbi.add(jpchase));
    }
}
