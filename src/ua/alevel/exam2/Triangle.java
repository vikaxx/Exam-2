package ua.alevel.exam2;

public class Triangle implements Figure {
    private double leftSide;
    private double rightSide;
    private double downSide;

    public Triangle() {
    }

    public Triangle(double leftSide, double rightSide, double downSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.downSide = downSide;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(double leftSide) {
        this.leftSide = leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public void setRightSide(double rightSide) {
        this.rightSide = rightSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;
    }

    @Override
    public double area() {
        double p = halfPerimeter();
        return Math.sqrt(p * (p - leftSide) * (p - rightSide) * (p - downSide));
    }

    @Override
    public double perimeter() {
        return leftSide + rightSide + downSide;
    }

    private double halfPerimeter() {
        return perimeter() / 2;
    }

    public double middleLine() {
        return downSide / 2;
    }

    public double height() {
        return (2 * area()) / downSide;
    }
}
