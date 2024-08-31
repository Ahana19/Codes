class Difference {
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class Subtractor {
    public static void main(String[] args) {
        Subtractor calculator = new Subtractor();

        System.out.println("Subtraction of 10 and 5: " + calculator.subtract(10, 5));
        System.out.println("Subtraction of 10.5 and 5.5: " + calculator.subtract(10.5, 5.5));
        System.out.println("Subtraction of 10, 5 and 3: " + calculator.subtract(10, 5, 3));
    }
}