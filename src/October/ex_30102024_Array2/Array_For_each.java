package October.ex_30102024_Array2;

public class Array_For_each {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 5;

        //for (int i = 0; i < arr.length; i++){
        //   System.out.println(arr[i]);
        //}

        for (int i:arr){
            System.out.println(i);
        }
    }
}
