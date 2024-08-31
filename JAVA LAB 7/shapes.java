class Shape {
    protected double area;
    
    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle
 extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void calculateArea() {
        area = length * width;
    }
}

public class shapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();
        circle.showArea();
        
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        rectangle.calculateArea();
        rectangle.showArea();
    }
}
