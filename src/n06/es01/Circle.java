package n06.es01;

public class Circle extends Shape{
    private double radius;
    
    public Circle() {   //raggio unitario, nero, pieno
        this(1.0);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) { //raggio indicato nero, pieno
        super(color, filled);
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = (radius > 0.0 ? radius : 0.0);
    }

    @Override
    public String toString() {
        return "Circle: " + radius + " - " + super.toString();
    }

    @Override
    public double perimeter() {
        return 2.0 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * (this.radius*this.radius);
    }
}
