package unit3;

public class Triangle extends Figure {
    public Triangle (Point[] point) {
        super(point);
    }

    @Override
    public double area() {
        return Math.abs((getPoint()[0].getX()*(getPoint()[1].getY()-getPoint()[2].getY()) +  getPoint()[1].getX()*(getPoint()[2].getY()-getPoint()[0].getY()) +  getPoint()[2].getX()*(getPoint()[0].getY()-getPoint()[1].getY())) / 2);
    }

    @Override
    public double perimeter() {
        double side1 = (getPoint()[1].getX() - getPoint()[0].getX()) + (getPoint()[1].getY() - getPoint()[0].getY());
        double side2 = (getPoint()[2].getX() - getPoint()[1].getX()) + (getPoint()[2].getY() - getPoint()[1].getY());
        double side3 = (getPoint()[2].getX() - getPoint()[0].getX()) + (getPoint()[2].getY() - getPoint()[0].getY());
        return side1 + side2 + side3;
    }

    @Override
    public void draw() {
        System.out.printf("треугольник с точками (%.2f %.2f) (%.2f %.2f) (%.2f %.2f), цветом %s \n", getPoint()[0].getX(), getPoint()[0].getY() , getPoint()[1].getX(), getPoint()[1].getY() , getPoint()[2].getX(), getPoint()[2].getY(), Color.BLACK);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("треугольник с точками (%.2f %.2f) (%.2f %.2f) (%.2f %.2f), цветом %s \n", getPoint()[0].getX(), getPoint()[0].getY() , getPoint()[1].getX(), getPoint()[1].getY() , getPoint()[2].getX(), getPoint()[2].getY(), color);
    }
}
