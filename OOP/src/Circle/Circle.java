package Circle;

import static java.lang.Math.*;

public class Circle {

    private float radius;

    private Color color;

    public Circle (float radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return radius * pow(PI, 2);
    }

    public double perimeter() {
        return PI * 2 * radius;
    }

    public void getInfo() {
        System.out.println("Radius = " + radius
                + "\nColor = " + color
                + "\nArea = " + area()
                + "\nPerimeter = " + perimeter());
    }

}
