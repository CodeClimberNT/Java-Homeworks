package n06.es02;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this(0.0, 0.0);
    }

    public Point2D(double point) {
        this(point, point);
    }

    public Point2D(double x, double y) {
        this.x = x > 0.0 ? x : 0.0;
        this.y = y > 0.0 ? y : 0.0;
    }

    public String toString() {
        return "(<" + this.x + ">, " + "<" + this.y + ">)";
    }

    protected String getString() {
        return "(<" + this.x + ">, " + "<" + this.y + ">, ";
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}