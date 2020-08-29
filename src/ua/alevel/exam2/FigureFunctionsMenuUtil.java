package ua.alevel.exam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FigureFunctionsMenuUtil {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void triangleFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");
        System.out.println("3 - Middle line");
        System.out.println("4 - Height");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();
            Triangle triangle;

            switch (input) {
                case "1":
                    triangle = FiguresInit.newTriangle();
                    System.out.println("Triangle area is: " + triangle.area());
                    break;
                case "2":
                    triangle = FiguresInit.newTriangle();
                    System.out.println("Triangle perimeter is: " + triangle.perimeter());
                    break;
                case "3":
                    triangle = FiguresInit.newTriangle();
                    System.out.println("Triangle middle line is: " + triangle.middleLine());
                    break;
                case "4":
                    triangle = FiguresInit.newTriangle();
                    System.out.println("Triangle height is: " + triangle.height());
                    break;
                case "0":
                    Task.run();
                    break;
                case "m":
                    Task.run();
                    break;
                case "q":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input 'q' to quit.\n");
                    triangleFunctions();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ellipseFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();
            Ellipse ellipse;

            switch (input) {
                case "1":
                    ellipse = FiguresInit.newEllipse();
                    System.out.println("Ellipse area is: " + ellipse.area());
                    break;
                case "2":
                    ellipse = FiguresInit.newEllipse();
                    System.out.println("Ellipse perimeter is: " + ellipse.perimeter());
                    break;
                case "0":
                    Task.run();
                    break;
                case "m":
                    Task.run();
                    break;
                case "q":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input 'q' to quit.\n");
                    ellipseFunctions();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void circleFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");
        System.out.println("3 - Diameter");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();
            Circle circle;

            switch (input) {
                case "1":
                    circle = FiguresInit.newCircle();
                    System.out.println("Circle area is: " + circle.area());
                    break;
                case "2":
                    circle = FiguresInit.newCircle();
                    System.out.println("Circle perimeter is: " + circle.perimeter());
                    break;
                case "3":
                    circle = FiguresInit.newCircle();
                    System.out.println("Circle diameter is: " + circle.diameter());
                    break;
                case "0":
                    Task.run();
                    break;
                case "m":
                    Task.run();
                    break;
                case "q":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input 'q' to quit.\n");
                    circleFunctions();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void rectangleFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");
        System.out.println("3 - Diagonal");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();
            Rectangle rectangle;
            switch (input) {
                case "1":
                    rectangle = FiguresInit.newRectangle();
                    System.out.println("Rectangle area is: " + rectangle.area());
                    break;
                case "2":
                    rectangle = FiguresInit.newRectangle();
                    System.out.println("Rectangle perimeter is: " + rectangle.perimeter());
                    break;
                case "3":
                    rectangle = FiguresInit.newRectangle();
                    System.out.println("Rectangle diagonal is: " + rectangle.diagonal());
                    break;
                case "0":
                    Task.run();
                    break;
                case "m":
                    Task.run();
                    break;
                case "q":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input 'q' to quit.\n");
                    rectangleFunctions();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void squareFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");
        System.out.println("3 - Diagonal");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();
            Square square;
            switch (input) {
                case "1":
                    square = FiguresInit.newSquare();
                    System.out.println("Square area is: " + square.area());
                    break;
                case "2":
                    square = FiguresInit.newSquare();
                    System.out.println("Square perimeter is: " + square.perimeter());
                    break;
                case "3":
                    square = FiguresInit.newSquare();
                    System.out.println("Square diagonal is: " + square.diagonal());
                    break;
                case "0":
                    Task.run();
                    break;
                case "m":
                    Task.run();
                    break;
                case "q":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input 'q' to quit.\n");
                    squareFunctions();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void pentagonFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");
        System.out.println("3 - Inside Corner");
        System.out.println("4 - Central Corner");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();
            Pentagon pentagon;

            switch (input) {
                case "1":
                    pentagon = FiguresInit.newPentagon();
                    System.out.println("Pentagon area is: " + pentagon.area());
                    break;
                case "2":
                    pentagon = FiguresInit.newPentagon();
                    System.out.println("Pentagon perimeter is: " + pentagon.perimeter());
                    break;
                case "3":
                    pentagon = FiguresInit.newPentagon();
                    System.out.println("Pentagon inside corner is: " + pentagon.insideCorner());
                    break;
                case "4":
                    pentagon = FiguresInit.newPentagon();
                    System.out.println("Pentagon center corner is: " + pentagon.centerCorner());
                    break;
                case "0":
                    Task.run();
                    break;
                case "m":
                    Task.run();
                    break;
                case "q":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input 'q' to quit.\n");
                    pentagonFunctions();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void hexagonFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");
        System.out.println("3 - Inside Corner");
        System.out.println("4 - Central Corner");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();
            Hexagon hexagon;

            switch (input) {
                case "1":
                    hexagon = FiguresInit.newHexagon();
                    System.out.println("Hexagon area is: " + hexagon.area());
                    break;
                case "2":
                    hexagon = FiguresInit.newHexagon();
                    System.out.println("Hexagon perimeter is: " + hexagon.perimeter());
                    break;
                case "3":
                    hexagon = FiguresInit.newHexagon();
                    System.out.println("Hexagon inside corner is: " + hexagon.insideCorner());
                    break;
                case "4":
                    hexagon = FiguresInit.newHexagon();
                    System.out.println("Hexagon center corner is: " + hexagon.centerCorner());
                    break;
                case "0":
                    Task.run();
                    break;
                case "m":
                    Task.run();
                    break;
                case "q":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input 'q' to quit.\n");
                    hexagonFunctions();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void octagonFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");
        System.out.println("3 - Inside Corner");
        System.out.println("4 - Central Corner");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();
            Octagon octagon;

            switch (input) {
                case "1":octagon = FiguresInit.newOctagon();
                    System.out.println("Octagon area is: " + octagon.area());
                    break;
                case "2":octagon = FiguresInit.newOctagon();
                    System.out.println("Octagon perimeter is: " + octagon.perimeter());
                    break;
                case "3":octagon = FiguresInit.newOctagon();
                    System.out.println("Octagon inside corner is: " + octagon.insideCorner());
                    break;
                case "4":octagon = FiguresInit.newOctagon();
                    System.out.println("Octagon center corner is: " + octagon.centerCorner());
                    break;
                case "0":
                    Task.run();
                    break;
                case "m":
                    Task.run();
                    break;
                case "q":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input 'q' to quit.\n");
                    octagonFunctions();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
