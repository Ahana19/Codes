import java.util.Scanner;

abstract class Student {
    int rollNo;
    int regNo;

    public abstract void course(String branch);

    public abstract void branch(String subject);
}

class Generic extends Student {
    public void course(String branch) {
        System.out.println("The course for " + branch + " is available.");
    }

    public void branch(String subject) {
        System.out.println("The subject " + subject + " is available in this branch.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the name of the subject in " + branchName + ": ");
        String subjectName = scanner.nextLine();

        Generic generic = new Generic();
        generic.course(branchName);
        generic.branch(subjectName);
    }
}
