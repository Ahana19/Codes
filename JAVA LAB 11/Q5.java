import java.util.*;

class Student {
    int rollNo;
    String name;
    int[] marks;
    double avgMarks;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.avgMarks = calculateAverageMarks();
    }

    double calculateAverageMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }

    static double[] calculateClassAverages(Student[] students) {
        int numSubjects = students[0].marks.length;
        double[] classAverages = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            int totalMarks = 0;
            for (Student student : students) {
                totalMarks += student.marks[i];
            }
            classAverages[i] = (double) totalMarks / students.length;
        }
        return classAverages;
    }

    static void displayStudentsDescendingOrder(Student[] students) {
        Arrays.sort(students, (a, b) -> Double.compare(b.avgMarks, a.avgMarks));
        System.out.println("Roll No\tName\tAverage Marks");
        for (Student student : students) {
            System.out.println(student.rollNo + "\t" + student.name + "\t" + student.avgMarks);
        }
    }
}

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt(); 
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Marks (5 subjects): ");
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }
            students[i] = new Student(rollNo, name, marks);
        }

        double[] classAverages = Student.calculateClassAverages(students);
        System.out.println("\nClass Averages:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i+1) + ": " + classAverages[i]);
        }

        System.out.println("\nStudent Details (Descending order of average marks):");
        Student.displayStudentsDescendingOrder(students);
    }
}
