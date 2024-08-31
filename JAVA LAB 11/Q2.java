import java.io.*;
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            FileWriter fw1 = new FileWriter("first.txt");
            FileWriter fw2 = new FileWriter("second.txt");
            
            System.out.println("Enter the strings (one string per line):");
            while(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if(isPalindrome(str)) {
                    fw1.write(str + "\n");
                } else {
                    fw2.write(str + "\n");
                }
            }
            
            fw1.close();
            fw2.close();
            
            FileReader fr = new FileReader("second.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            Map<Character, Integer> charFreq = new HashMap<>();
            while(line != null) {
                for(char c : line.toCharArray()) {
                    charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
                }
                line = br.readLine();
            }
            
            System.out.println("Frequency of characters in second.txt:");
            for(Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            
            fr.close();
            br.close();
            
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for(int i=0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
}
