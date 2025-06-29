package unit3;

public class Square extends Figure{
    public Square (Point[] point) {
        super(point);
    }

    @Override
    public double area() {
        double a = Math.abs(getPoint()[0].getX() - getPoint()[2].getX());
        return a * a;
    }

    @Override
    public double perimeter() {
        double a = Math.abs(getPoint()[0].getX() - getPoint()[2].getX());
        return 2 * (a + a);
    }

    @Override
    public void draw() {
        System.out.printf("квадрат с точками (%.2f %.2f) (%.2f %.2f) (%.2f %.2f) (%.2f %.2f), цветом %s \n", getPoint()[0].getX(), getPoint()[0].getY() , getPoint()[1].getX(), getPoint()[1].getY() , getPoint()[2].getX(), getPoint()[2].getY() , getPoint()[3].getX(), getPoint()[3].getY(), Color.BLACK);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("квадрат с точками (%.2f %.2f) (%.2f %.2f) (%.2f %.2f) (%.2f %.2f), цветом %s \n", getPoint()[0].getX(), getPoint()[0].getY() , getPoint()[1].getX(), getPoint()[1].getY() , getPoint()[2].getX(), getPoint()[2].getY() , getPoint()[3].getX(), getPoint()[3].getY(), color);
    }
}
