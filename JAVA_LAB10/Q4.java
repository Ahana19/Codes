import java.util.Scanner;

public class Q4cse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Reversing the string using StringBuilder
        String reverseStr = new StringBuilder(str).reverse().toString();

        // Checking if the string is equal to its reverse
        if (str.equals(reverseStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
