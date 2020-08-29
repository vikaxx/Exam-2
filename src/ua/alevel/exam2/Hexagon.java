package ua.alevel.exam2;

public class Hexagon extends Polygon {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        if (side > 0) this.side = side;
        else {
            System.out.println("Error. Side can not be less than 0.");
            this.side = FiguresInit.newHexagon().getSide();
        }
    }

    @Override
    public double area() {
        return (3*Math.sqrt(3)*side*side)/2;
    }

    @Override
    public double perimeter() {
        return side*6;
    }

    @Override
    public int insideCorner() {
        return (180*(6-2))/(6);
    }

    @Override
    public int centerCorner() {
        return 360/6;
    }
}
