package ua.alevel.exam2;

public class Triangle implements Figure {
    private double leftSide;
    private double rightSide;
    private double downSide;

    public double getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(double leftSide) {
        if (leftSide > 0) this.leftSide = leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public void setRightSide(double rightSide) {
        if (rightSide > 0) this.rightSide = rightSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;

        if (downSide > 0 && this.rightSide > 0 && this.leftSide > 0) this.downSide = downSide;
        else {
            System.out.println("Error. Side can not be less than 0.");
            Triangle triangle = FiguresInit.newTriangle();
            this.leftSide = triangle.getLeftSide();
            this.rightSide = triangle.getRightSide();
            this.downSide = triangle.getDownSide();
        }
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
