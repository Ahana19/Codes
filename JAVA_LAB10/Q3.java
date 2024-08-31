import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read first string from user
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        // Read second string from user
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Change case of the first string
        String str1Upper = str1.toUpperCase();
        String str1Lower = str1.toLowerCase();
        System.out.println("Uppercase of the first string: " + str1Upper);
        System.out.println("Lowercase of the first string: " + str1Lower);

        // Reverse the second string
        String str2Reverse = new StringBuilder(str2).reverse().toString();
        System.out.println("Reverse of the second string: " + str2Reverse);

        // Compare the two strings
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }

        // Insert the first string into the second string
        System.out.print("Enter the index where the first string should be inserted into the second string: ");
        int index = scanner.nextInt();
        String strInsert = str2.substring(0, index) + str1 + str2.substring(index);
        System.out.println("Result after inserting the first string into the second string: " + strInsert);
    }


}
