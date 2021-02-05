package n06.es01;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this("black", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        return this.color + " " + this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDrawing() {
        return this.color + " " + this.filled;
    }

    public abstract double area();

    public abstract double perimeter();

}