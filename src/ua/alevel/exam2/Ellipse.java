package ua.alevel.exam2;

public class Ellipse implements Figure {
    private final double pi = Math.PI;
    private double bigFocus;
    private double smallFocus;

    public double getBigFocus() {
        return bigFocus;
    }

    public void setBigFocus(double bigFocus) {
        this.bigFocus = bigFocus;
    }

    public double getSmallFocus() {
        return smallFocus;
    }

    public void setSmallFocus(double smallFocus) {
        this.smallFocus = smallFocus;
    }

    public double getPi() {

        return pi;
    }

    @Override
    public double area() {
        return pi * bigFocus * smallFocus;
    }

    @Override
    public double perimeter() {
        return 4 * (
                (pi * bigFocus * smallFocus + (bigFocus - smallFocus) * (bigFocus - smallFocus))
                        / (bigFocus + smallFocus));
    }
}
