import java.util.Scanner;

class Interest {
    public void display(double p, double r, double t) {
        System.out.println("Interest amount: " + (p * r * t / 100));
    }
}

class SimpleInterest extends Interest {
    public void display(double p, double r, double t) {
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest amount: " + si);
    }
}

class CompoundInterest extends Interest {
    public void display(double p, double r, double t) {
        double ci = p * Math.pow(1 + r / 100, t) - p;
        System.out.println("Compound Interest amount: " + ci);
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time period in years: ");
        double t = sc.nextDouble();
        System.out.print("Enter 1 for Simple Interest or 2 for Compound Interest: ");
        int choice = sc.nextInt();

        Interest i;
        if (choice == 1) {
            i = new SimpleInterest();
        } else {
            i = new CompoundInterest();
        }

        i.display(p, r, t);
    }
}
