package unit3;

public class Rectangle extends Figure {
    public Rectangle(Point[] point) {
        super(point);
    }

    @Override
    public double area() {
        return (Math.abs(getPoint()[0].getX() - getPoint()[2].getX())) * (Math.abs(getPoint()[0].getY() - getPoint()[1].getY()));
    }

    @Override
    public double perimeter() {
        return 2 * ((Math.abs(getPoint()[0].getX() - getPoint()[2].getX())) + (Math.abs(getPoint()[0].getY() - getPoint()[1].getY())));
    }

    @Override
    public void draw() {
        System.out.printf("прямоугольник с точками (%.2f %.2f) (%.2f %.2f) (%.2f %.2f) (%.2f %.2f), цветом %s \n", getPoint()[0].getX(), getPoint()[0].getY() , getPoint()[1].getX(), getPoint()[1].getY() , getPoint()[2].getX(), getPoint()[2].getY() , getPoint()[3].getX(), getPoint()[3].getY(), Color.BLACK);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("прямоугольник с точками (%.2f %.2f) (%.2f %.2f) (%.2f %.2f) (%.2f %.2f), цветом %s \n", getPoint()[0].getX(), getPoint()[0].getY() , getPoint()[1].getX(), getPoint()[1].getY() , getPoint()[2].getX(), getPoint()[2].getY() , getPoint()[3].getX(), getPoint()[3].getY(), color);
    }
}
