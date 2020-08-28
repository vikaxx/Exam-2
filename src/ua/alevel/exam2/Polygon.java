package ua.alevel.exam2;

public abstract class Polygon implements Figure {
    @Override
    abstract public double area();

    @Override
    abstract public double perimeter();

    abstract public int insideCorner();
    abstract public int centerCorner();
}
