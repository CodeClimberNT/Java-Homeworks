package n06.es03;

public class Plane {
    Point3D p1;
    Point3D p2;
    Point3D p3;

    public Plane() {
        this(new Point3D(1.0, 0.0, 0.0), new Point3D(0.0, 1.0, 0.0), new Point3D(0.0, 0.0, 1.0));
    }

    public Plane(Point3D p1, Point3D p2, Point3D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
}
