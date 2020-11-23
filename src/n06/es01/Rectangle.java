package n06.es01;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0); 
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        setWidth(width);
        setHeight(height);
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    @Override
    public String toString() {
        return "Rectangle: " + width + " " + height + " - " + super.toString();
    }

    @Override
    public double perimeter() {
        return 2.0 * (width + height); 
    }

    @Override
    public double area() {
        return width * height;
    }

}
