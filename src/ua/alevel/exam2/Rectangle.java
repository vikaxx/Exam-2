package ua.alevel.exam2;

public class Rectangle implements Quadrangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0 && this.length != 0) this.width = width;
        else {
            System.out.println("Error. Side can not be less than 0.");
            Rectangle rectangle = FiguresInit.newRectangle();
            this.length = rectangle.getLength();
            this.width = rectangle.getWidth();
        }
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}
