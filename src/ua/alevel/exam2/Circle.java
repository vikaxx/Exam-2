package ua.alevel.exam2;

public class Circle extends Ellipse {
    private final double pi = super.getPi();
    private double radius;

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius;
        else {
            System.out.println("Error. Radius can not be less than 0.");
            this.radius = FiguresInit.newCircle().getRadius();
        }
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    public double diameter() {
        return radius * 2;
    }
}
