package ua.alevel.exam2;

public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        if (side > 0) this.side = side;
        else {
            System.out.println("Error. Side can not be less than 0.");
            this.side = FiguresInit.newSquare().getSide();
        }
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public double diagonal() {
        return Math.sqrt(2 * (Math.pow(side, 2)));
    }
}
