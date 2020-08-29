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

//            if (goBack(Double.parseDouble(input))){
//                FigureFunctionsMenuUtil.triangleFunctions();
//            }

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
//            if (goBack()){
//                FigureFunctionsMenuUtil.ellipseFunctions();
//            }
            System.out.print("Input first focus: ");
            String input = reader.readLine();
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
//            if (goBack()){
//                FigureFunctionsMenuUtil.circleFunctions();
//            }
            System.out.print("Input radius: ");
            String input = reader.readLine();
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
//            if (goBack()){
//                FigureFunctionsMenuUtil.rectangleFunctions();
//            }
            System.out.print("Input length: ");
            String input = reader.readLine();
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
//            if (goBack()){
//                FigureFunctionsMenuUtil.squareFunctions();
//            }
            System.out.print("Input side's length: ");
            String input = reader.readLine();
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
//            if (goBack()){
//                FigureFunctionsMenuUtil.pentagonFunctions();
//            }
            System.out.print("Input side's length: ");
            String input = reader.readLine();
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
//            if (goBack()){
//                FigureFunctionsMenuUtil.hexagonFunctions();
//            }
            System.out.print("Input side's length: ");
            String input = reader.readLine();
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
//            if (goBack()){
//                FigureFunctionsMenuUtil.octagonFunctions();
//            }
            System.out.print("Input side's length: ");
            String input = reader.readLine();
            octagon.setSide(Double.parseDouble(input));

        } catch (Exception e) {
            System.out.println("Value cannot be less than 0.");
            return newOctagon();
        }

        return octagon;
    }

//    private static boolean goBack(double isBack) {
//        boolean back = false;
//
//        if (isBack == 0) {
//            back = true;
//        }
//
//        return back;
//    }

}
