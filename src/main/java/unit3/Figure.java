package unit3;

abstract class Figure implements Drawable {
    private Point[] point;

    public Point[] getPoint(){
        return point;
    }

    public Figure(Point[] point) {
        this.point = point;
    }

    public abstract double area();
    public abstract double perimeter();

    public abstract void draw();

    public abstract void draw(Color color);
}
