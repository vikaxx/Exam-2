package ua.alevel.exam2;

public class Octagon extends Polygon {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        if (side > 0) this.side = side;
        else {
            System.out.println("Error. Side can not be less than 0.");
            this.side = FiguresInit.newOctagon().getSide();
        }
    }

    @Override
    public double area() {
        return 2 * side * side * (1 + Math.sqrt(2));
    }

    @Override
    public double perimeter() {
        return side * 8;
    }

    @Override
    public int insideCorner() {
        return (180*(8-2))/(8);
    }

    @Override
    public int centerCorner() {
        return 360/8;
    }
}
