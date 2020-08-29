package ua.alevel.exam2;

public class Ellipse implements Figure {
    private final double pi = Math.PI;
    private double bigFocus;
    private double smallFocus;


    public double getBigFocus() {
        return bigFocus;
    }

    public void setBigFocus(double bigFocus) {
        if (bigFocus > 0) this.bigFocus = bigFocus;
    }

    public double getSmallFocus() {
        return smallFocus;

    }

    public void setSmallFocus(double smallFocus) {
        if (smallFocus > 0 && this.bigFocus != 0) this.smallFocus = smallFocus;
        else {
            System.out.println("Error. Focus can not be less than 0.");
            Ellipse ellipse = FiguresInit.newEllipse();
            this.bigFocus = ellipse.getBigFocus();
            this.smallFocus = ellipse.getSmallFocus();
        }
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
