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
                    try {
                        triangle = FiguresInit.newTriangle();
                        System.out.println("Triangle area is: " + triangle.area());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "2":
                    try {
                        triangle = FiguresInit.newTriangle();
                        System.out.println("Triangle perimeter is: " + triangle.perimeter());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "3":
                    try {
                        triangle = FiguresInit.newTriangle();
                        System.out.println("Triangle middle line is: " + triangle.middleLine());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "4":
                    try {
                        triangle = FiguresInit.newTriangle();
                        System.out.println("Triangle height is: " + triangle.height());
                    } catch (NullPointerException e) {
                    }
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
                    try {
                        ellipse = FiguresInit.newEllipse();
                        System.out.println("Ellipse area is: " + ellipse.area());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "2":
                    try {
                        ellipse = FiguresInit.newEllipse();
                        System.out.println("Ellipse perimeter is: " + ellipse.perimeter());
                    } catch (NullPointerException e) {
                    }
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
                    try {
                        circle = FiguresInit.newCircle();
                        System.out.println("Circle area is: " + circle.area());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "2":
                    try {
                        circle = FiguresInit.newCircle();
                        System.out.println("Circle perimeter is: " + circle.perimeter());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "3":
                    try {
                        circle = FiguresInit.newCircle();
                        System.out.println("Circle diameter is: " + circle.diameter());
                    } catch (NullPointerException e) {
                    }
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
                    try {
                        rectangle = FiguresInit.newRectangle();
                        System.out.println("Rectangle area is: " + rectangle.area());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "2":
                    try {
                        rectangle = FiguresInit.newRectangle();
                        System.out.println("Rectangle perimeter is: " + rectangle.perimeter());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "3":
                    try {
                        rectangle = FiguresInit.newRectangle();
                        System.out.println("Rectangle diagonal is: " + rectangle.diagonal());
                    } catch (NullPointerException e) {
                    }
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
                    try {
                        square = FiguresInit.newSquare();
                        System.out.println("Square area is: " + square.area());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "2":
                    try {
                        square = FiguresInit.newSquare();
                        System.out.println("Square perimeter is: " + square.perimeter());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "3":
                    try {
                        square = FiguresInit.newSquare();
                        System.out.println("Square diagonal is: " + square.diagonal());
                    } catch (NullPointerException e) {
                    }
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
                    try {
                        pentagon = FiguresInit.newPentagon();
                        System.out.println("Pentagon area is: " + pentagon.area());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "2":
                    try {
                        pentagon = FiguresInit.newPentagon();
                        System.out.println("Pentagon perimeter is: " + pentagon.perimeter());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "3":
                    try {
                        pentagon = FiguresInit.newPentagon();
                        System.out.println("Pentagon inside corner is: " + pentagon.insideCorner());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "4":
                    try {
                        pentagon = FiguresInit.newPentagon();
                        System.out.println("Pentagon center corner is: " + pentagon.centerCorner());
                    } catch (NullPointerException e) {
                    }
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
                    try {
                        hexagon = FiguresInit.newHexagon();
                        System.out.println("Hexagon area is: " + hexagon.area());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "2":
                    try {
                        hexagon = FiguresInit.newHexagon();
                        System.out.println("Hexagon perimeter is: " + hexagon.perimeter());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "3":
                    try {
                        hexagon = FiguresInit.newHexagon();
                        System.out.println("Hexagon inside corner is: " + hexagon.insideCorner());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "4":
                    try {
                        hexagon = FiguresInit.newHexagon();
                        System.out.println("Hexagon center corner is: " + hexagon.centerCorner());
                    } catch (NullPointerException e) {
                    }
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
                case "1":
                    try {
                        octagon = FiguresInit.newOctagon();
                        System.out.println("Octagon area is: " + octagon.area());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "2":
                    try {
                        octagon = FiguresInit.newOctagon();
                        System.out.println("Octagon perimeter is: " + octagon.perimeter());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "3":
                    try {
                        octagon = FiguresInit.newOctagon();
                        System.out.println("Octagon inside corner is: " + octagon.insideCorner());
                    } catch (NullPointerException e) {
                    }
                    break;
                case "4":
                    try {
                        octagon = FiguresInit.newOctagon();
                        System.out.println("Octagon center corner is: " + octagon.centerCorner());
                    } catch (NullPointerException e) {
                    }
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
