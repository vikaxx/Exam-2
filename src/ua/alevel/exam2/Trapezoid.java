package ua.alevel.exam2;

public class Trapezoid implements Quadrangle {
    private double upSide;
    private double downSide;
    private double leftSide;
    private double rightSide;
    private double height;

    public double getUpSide() {
        return upSide;
    }

    public void setUpSide(double upSide) {
        this.upSide = upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height*middleLine();
    }

    @Override
    public double perimeter() {
        return upSide+downSide+leftSide+rightSide;
    }

    public double middleLine() {
        return 0;
    }

}
