import java.util.Scanner;
class Shapes{

    void area(int len, int wid){
        System.out.println("Area of the rectangle : " + (len * wid) + " sq units.");
    }

    void area(double rad){
        System.out.println("Area of the circle : " + (3.142 * rad * rad) + " sq units.");
    }

    void area(double base, double ht){
        System.out.println("Area of the triangle : " + (0.5 * base * ht) + " sq units.");
    }
}

class Area{
    public static void main(String[] args)
    {
        Shapes ob1 = new Shapes();
        ob1.area(20, 30);
        ob1.area(4.2, 4.2);
        ob1.area(7.0);
    }
}