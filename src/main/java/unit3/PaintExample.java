package unit3;

public class PaintExample {

    public static void pointMain() {
        Point[] cr = new Point[] {new Point(10, 12)};
        Circle circle = new Circle(cr, 5);

        Point[] rc = new Point[] {new Point(1, 1), new Point(1, 4), new Point(5, 1), new Point(5, 4)};
        Rectangle rectangle = new Rectangle(rc);

        Point[] sq = new Point[] {new Point(1, 1), new Point(1, 4), new Point(4, 1), new Point(4, 4)};
        Square square = new Square(sq);

        Point[] tr = new Point[] {new Point(1, 1), new Point(5, 1), new Point(3, 5)};
        Triangle triangle = new Triangle(tr);

        System.out.println("Площади");
        System.out.println("Площадь круга: " + FigureUtil.area(circle));
        System.out.println("Площадь прямоугольника: " + FigureUtil.area(rectangle));
        System.out.println("Площадь квадрата: " + FigureUtil.area(square));
        System.out.println("Площадь треугольника: " + FigureUtil.area(triangle));
        System.out.println();

        System.out.println("Периметры");
        System.out.println("Площадь круга: " + FigureUtil.perimeter(circle));
        System.out.println("Площадь прямоугольника: " + FigureUtil.perimeter(rectangle));
        System.out.println("Площадь квадрата: " + FigureUtil.perimeter(square));
        System.out.println("Площадь треугольника: " + FigureUtil.perimeter(triangle));
        System.out.println();

        System.out.println("draw(Figure figure)");
        FigureUtil.draw(circle);
        FigureUtil.draw(rectangle);
        FigureUtil.draw(square);
        FigureUtil.draw(triangle);
        System.out.println();

        System.out.println("draw(Figure figure, Color color)");
        FigureUtil.draw(circle, Color.BLUE);
        FigureUtil.draw(rectangle, Color.RED);
        FigureUtil.draw(square, Color.GREEN);
        FigureUtil.draw(triangle, Color.PURPLE);
        System.out.println();
    }
}
