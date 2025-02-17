package October.ex_30102024_Array2;

public class Array_2D_iterate {
    public static void main(String[] args) {

        //Multidimentional Array - 2D, 3D array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
