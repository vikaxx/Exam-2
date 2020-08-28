package ua.alevel.exam2;

public class Parallelogram implements Quadrangle {
    private double upAndDownSide;
    private double leftAndRightSide;
    private double height;

    public double getUpAndDownSide() {
        return upAndDownSide;
    }

    public void setUpAndDownSide(double upAndDownSide) {
        this.upAndDownSide = upAndDownSide;
    }

    public double getLeftAndRightSide() {
        return leftAndRightSide;
    }

    public void setLeftAndRightSide(double leftAndRightSide) {
        this.leftAndRightSide = leftAndRightSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return upAndDownSide*height;
    }

    @Override
    public double perimeter() {
        return 2*(upAndDownSide+leftAndRightSide);
    }
}
