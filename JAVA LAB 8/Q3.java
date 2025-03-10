import java.util.Scanner;

interface Employee {
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}

class Manager implements Employee {
    public double earnings(double basic) {
        return basic + 0.8 * basic + 0.15 * basic;
    }

    public double deductions(double basic) {
        return 0.12 * basic;
    }

    public double bonus(double basic) {
        return 0;
    }
}

class Substaff extends Manager {
    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basic = scanner.nextDouble();

        Substaff substaff = new Substaff();

        double earnings = substaff.earnings(basic);
        double deductions = substaff.deductions(basic);
        double bonus = substaff.bonus(basic);

        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}
