import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers : ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
            System.out.print(i+1 + ". " + arr[i] + " Even\n");   
            }
            else{
                System.out.print(i+1 + ". "  + arr[i] + " Odd\n");
            }
        }    
    }
}