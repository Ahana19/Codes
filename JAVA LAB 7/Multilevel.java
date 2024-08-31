class Plate {
    protected double length, width;

    public Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Constructing a plate with dimensions " + length + " x " + width);
    }
}

class Box extends Plate {
    protected double height;

    public Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Constructing a box with dimensions " + length + " x " + width + " x " + height);
    }
}

class WoodBox extends Box {
    protected double thickness;

    public WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thickness = t;
        System.out.println("Constructing a wooden box with dimensions " + length + " x " + width + " x " + height + " and thickness " + thickness);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(10, 20, 30, 2.5);
    }
}
