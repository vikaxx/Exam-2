package ua.alevel.exam2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiguresInit {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static Triangle newTriangle() {
        Triangle triangle = new Triangle();

        try {
            System.out.print("Input first side's length (0 to go back to menu): ");
            String input = reader.readLine();

            if (Double.parseDouble(input) == 0) {
                FigureFunctionsMenuUtil.triangleFunctions();
                return null;
            }

            triangle.setLeftSide(Double.parseDouble(input));

            System.out.print("Input second side's length: ");
            input = reader.readLine();
            triangle.setRightSide(Double.parseDouble(input));

            System.out.print("Input third side's length: ");
            input = reader.readLine();
            triangle.setDownSide(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newTriangle();
        }

        return triangle;
    }

    public static Ellipse newEllipse() {
        Ellipse ellipse = new Ellipse();

        try {
            System.out.print("Input first focus (0 to go back to menu): ");
            String input = reader.readLine();

            if (Double.parseDouble(input) == 0) {
                FigureFunctionsMenuUtil.ellipseFunctions();
                return null;
            }

            ellipse.setBigFocus(Double.parseDouble(input));

            System.out.print("Input second focus: ");
            input = reader.readLine();
            ellipse.setSmallFocus(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newEllipse();
        }

        return ellipse;
    }

    public static Circle newCircle() {
        Circle circle = new Circle();
        try {

            System.out.print("Input radius (0 to go back to menu): ");
            String input = reader.readLine();

            if (Double.parseDouble(input) == 0) {
                FigureFunctionsMenuUtil.circleFunctions();
                return null;
            }

            circle.setRadius(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newCircle();
        }

        return circle;
    }

    public static Rectangle newRectangle() {
        Rectangle rectangle = new Rectangle();
        try {

            System.out.print("Input length (0 to go back to menu): ");
            String input = reader.readLine();

            if (Double.parseDouble(input) == 0) {
                FigureFunctionsMenuUtil.rectangleFunctions();
                return null;
            }

            rectangle.setLength(Double.parseDouble(input));

            System.out.print("Input width: ");
            input = reader.readLine();
            rectangle.setWidth(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newRectangle();
        }

        return rectangle;
    }

    public static Square newSquare() {
        Square square = new Square();
        try {

            System.out.print("Input side's length (0 to go back to menu): ");
            String input = reader.readLine();

            if (Double.parseDouble(input) == 0) {
                FigureFunctionsMenuUtil.squareFunctions();
                return null;
            }

            square.setSide(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newSquare();
        }

        return square;
    }

    public static Pentagon newPentagon() {
        Pentagon pentagon = new Pentagon();
        try {

            System.out.print("Input side's length (0 to go back to menu): ");
            String input = reader.readLine();

            if (Double.parseDouble(input) == 0) {
                FigureFunctionsMenuUtil.pentagonFunctions();
                return null;
            }

            pentagon.setSide(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newPentagon();
        }

        return pentagon;
    }

    public static Hexagon newHexagon() {
        Hexagon hexagon = new Hexagon();
        try {

            System.out.print("Input side's length (0 to go back to menu): ");
            String input = reader.readLine();

            if (Double.parseDouble(input) == 0) {
                FigureFunctionsMenuUtil.hexagonFunctions();
                return null;
            }

            hexagon.setSide(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newHexagon();
        }

        return hexagon;
    }

    public static Octagon newOctagon() {
        Octagon octagon = new Octagon();
        try {

            System.out.print("Input side's length (0 to go back to menu): ");
            String input = reader.readLine();

            if (Double.parseDouble(input) == 0) {
                FigureFunctionsMenuUtil.octagonFunctions();
                return null;
            }

            octagon.setSide(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newOctagon();
        }

        return octagon;
    }

}
