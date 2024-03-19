package Paint;

public class PaintExample {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(1, 1));
        Square square = new Square(new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(0, 1));
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(3, 0), new Point(0, 1), new Point(0, 1));
        Circle circle = new Circle(new Point(1, 0), new Point(-1, 0), new Point(0, 1));

        FigureUtil.area(triangle);
        FigureUtil.perimeter(square);
        FigureUtil.draw(rectangle);
        FigureUtil.draw(circle, Color.Green);

    }

}
