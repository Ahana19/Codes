import java.util.*;

public class Q5 {

    static void Sum_of_Diagonals1(int[][] matrix, int N) {

        int Ld = 0, Rd = 0;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (i == j)
                    Ld += matrix[i][j];

                if ((i + j) == (N - 1))
                    Rd += matrix[i][j];
            }
        }

        System.out.println("\nSum of Left Diagonal:" + Ld);

        System.out.println("\nSum of Right Diagonal:" + Rd);
    }

    public static void main(String[] args) {
        int m, n, i, j;
        Scanner a = null;
        a = new Scanner(System.in);
        System.out.println("Enter the number " + "of rows of the matrix");
        m = a.nextInt();
        System.out.println("Enter the number " + "of columns of the matrix");
        n = a.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++)
            {
                arr[i][j] = a.nextInt();
            }
        }

        Sum_of_Diagonals1(arr, n);
    }
}
