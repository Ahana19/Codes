import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[arr.length];
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;   
                    freq[j] = visited;  
                }  
            }  
            if(freq[i] != visited)  
                freq[i] = count;  
        }
      
        System.out.println(" Element   Frequency");  
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println("    " + arr[i] + "       " + freq[i]);  
        }  
    
    }
}