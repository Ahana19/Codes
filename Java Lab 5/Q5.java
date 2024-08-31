import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int suml=0;
        int sumr=0;
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i==j)
                {
                    suml = suml + arr[i][j];
                }
                if((i+j) == n-1)
                {
                    sumr = sumr + arr[i][j];
                }
            }
        }
        System.out.println("Left Diagonal: "+suml);
        System.out.println("Right Diagonal: "+sumr);
    }
}
