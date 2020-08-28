package ua.alevel.exam2;

public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area(){
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    public double getDiagonal(){
        return Math.sqrt(2*(Math.pow(side,2)));
    }
}
