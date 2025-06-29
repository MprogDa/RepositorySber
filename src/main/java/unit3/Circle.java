package unit3;

class Circle extends Figure {
    private double radius;

    public Circle(Point[] pointCenter, double radius) {
        super(pointCenter);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("круг с центром (%.2f %.2f), радиусом %.2f, цветом %s \n", getPoint()[0].getX(), getPoint()[0].getY(), radius, Color.BLACK);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("круг с центром (%.2f %.2f), радиусом %.2f, цветом %s \n", getPoint()[0].getX(), getPoint()[0].getY(), radius, color);
    }
}
