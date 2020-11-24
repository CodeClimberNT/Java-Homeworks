package n06.es03;

import n06.es02.Point2D;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        this(0.0, 0.0, 0.0);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public String toString() {
        return super.getString() + "<" +  this.z + ">)";
    }

    public String getString() {
        return super.getString() + "<" +  this.z + ">, ";
    }
}
