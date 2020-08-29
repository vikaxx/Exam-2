package ua.alevel.exam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void run() {

        try {

            while (true) {
                System.out.println("\nChoose a figure, please: ");
                System.out.println("1 - Triangle");
                System.out.println("2 - Ellipse");
                System.out.println("3 - Circle");
                System.out.println("4 - Pentagon");
                System.out.println("5 - Hexagon");
                System.out.println("6 - Octagon");
                System.out.println("7 - Rectangle");
                System.out.println("8 - Square");
                System.out.println("q - quit\n");

                String input = reader.readLine();

                switch (input) {
                    case "1":
                        FigureFunctionsMenuUtil.triangleFunctions();
                        break;
                    case "2":
                        FigureFunctionsMenuUtil.ellipseFunctions();
                        break;
                    case "3":
                        FigureFunctionsMenuUtil.circleFunctions();
                        break;
                    case "4":
                        FigureFunctionsMenuUtil.pentagonFunctions();
                        break;
                    case "5":
                        FigureFunctionsMenuUtil.hexagonFunctions();
                        break;
                    case "6":
                        FigureFunctionsMenuUtil.octagonFunctions();
                        break;
                    case "7":
                        FigureFunctionsMenuUtil.rectangleFunctions();
                        break;
                    case "8":
                        FigureFunctionsMenuUtil.squareFunctions();
                        break;
                    case "q":
                        System.out.println("Exit!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Input 'q' to quit.\n");
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
