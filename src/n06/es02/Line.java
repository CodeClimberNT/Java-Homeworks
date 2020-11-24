package n06.es02;

public class Line {
    private Point2D inizio;
    private Point2D fine;
    private double m;
    private double q;

    public Line() {
        this(new Point2D(0.0, 0.0), new Point2D(0.0, 0.0));
    }

    public Line(Point2D fine) {
        this(new Point2D(0.0, 0.0), fine);
    }

    public Line(Point2D inizio, Point2D fine) {
        this.inizio = inizio;
        this.fine = fine;
        setM();
        setQ();
    }

    private void setM() {
        this.m = ( this.inizio.getY() - this.fine.getY() ) / ( this.inizio.getX() - this.fine.getX() );
    }

    private void setQ() {
        this.q = this.inizio.getY() - this.m*this.inizio.getX();
    }

    public String toString() {
        return "y = " + m + "x " + q;
    }
}
