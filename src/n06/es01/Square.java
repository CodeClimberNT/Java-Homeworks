package n06.es01;

public class Square extends Rectangle{
    private double side;

    public Square() {
        this(1.0);
    }

    public Square(double side) {
        super();
        setSide(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }


    public void setSide(double side) {
        this.side = side > 0.0 ? side : 0.0;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setHeight(double side) {
        setSide(side);
    }

    @Override
    public double perimeter(){
        return this.side*4;
    }

    @Override
    public double area(){
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "Square: " + side + " " + getDrawing();
    }

}
