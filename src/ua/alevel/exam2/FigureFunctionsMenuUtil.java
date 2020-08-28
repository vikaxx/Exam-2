package ua.alevel.exam2;

import ua.alevel.exam2.input.FiguresAreaInput;

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

            switch (input) {
                case "1":
                    System.out.println("area of this triangle is: " + FiguresAreaInput.triangleAreaInput());
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

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

            switch (input) {
                case "1":

                    break;
                case "2":

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

            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

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
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parallelogramFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();

            switch (input) {
                case "1":

                    break;
                case "2":

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
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void rhombusFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();

            switch (input) {
                case "1":

                    break;
                case "2":

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
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void trapezoidFunctions() {
        System.out.println("\nChoose characteristic, please: ");
        System.out.println("1 - Area");
        System.out.println("2 - Perimeter");
        System.out.println("3 - Middle line");

        System.out.println("0 - back");
        System.out.println("m - to main menu");
        System.out.println("q - quit\n");

        try {
            String input = reader.readLine();

            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

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

            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

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

            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

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

            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

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

            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

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

            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

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
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
