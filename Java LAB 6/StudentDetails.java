import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        // Declare arrays to store roll, name, and CGPA of students
        int[] roll = new int[n];
        String[] name = new String[n];
        double[] cgpa = new double[n];
        
        // Input details of students
        for(int i=0; i<n; i++) {
            System.out.println("Enter details of student "+(i+1)+":");
            System.out.print("Roll: ");
            roll[i] = sc.nextInt();
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("CGPA: ");
            cgpa[i] = sc.nextDouble();
        }
        
        // Display details of all students
        System.out.println("\nDetails of all students:");
        for(int i=0; i<n; i++) {
            System.out.println("Roll: "+roll[i]+"\tName: "+name[i]+"\tCGPA: "+cgpa[i]);
        }
        
        // Find the student with the lowest CGPA
        double lowest_cgpa = cgpa[0];
        String lowest_cgpa_name = name[0];
        for(int i=1; i<n; i++) {
            if(cgpa[i] < lowest_cgpa) {
                lowest_cgpa = cgpa[i];
                lowest_cgpa_name = name[i];
            }
        }
        
        // Display the name of the student with the lowest CGPA
        System.out.println("\nStudent with lowest CGPA: " + lowest_cgpa_name);
    }
}