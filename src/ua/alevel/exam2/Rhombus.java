package ua.alevel.exam2;

public class Rhombus extends Parallelogram {
    private double side;
    private double height;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public double area() {
        return side*height;
    }
}
