import java.util.Scanner;

class TwoD {
    protected double length, width;

    public void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    public double getArea() {
        return length * width;
    }

    public double getCost() {
        return getArea() * 40;
    }
}

class ThreeD extends TwoD {
    private double height;

    public void setDimensions(double l, double w, double h) {
        super.setDimensions(l, w);
        height = h;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getCost() {
        return getVolume() * 60;
    }
}

public class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TwoD shape = new TwoD();

        System.out.println("Enter dimensions for the plastic shape (2D sheet):");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();

        shape.setDimensions(length, width);
        double cost = shape.getCost();
        System.out.println("The cost of the plastic sheet is Rs " + cost);

        ThreeD box = new ThreeD();

        System.out.println("Enter dimensions for the plastic shape (3D box):");
        System.out.print("Length: ");
        length = scanner.nextDouble();
        System.out.print("Width: ");
        width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        box.setDimensions(length, width, height);
        cost = box.getCost();
        System.out.println("The cost of the plastic box is Rs " + cost);

        scanner.close();
    }
}
