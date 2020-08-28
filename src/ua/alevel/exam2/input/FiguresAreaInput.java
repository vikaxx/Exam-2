package ua.alevel.exam2.input;

import ua.alevel.exam2.Figure;
import ua.alevel.exam2.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiguresAreaInput {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Figure figure;

    public static double triangleAreaInput() {
        String input = "";
        double leftSide = 0;
        double rightSide = 0;
        double downSide = 0;
        System.out.println("Triangle area...");

        try {
            System.out.print("Input first size's length: ");
            input = reader.readLine();
            leftSide = Integer.parseInt(input);
            System.out.print("Input second size's length: ");
            input = reader.readLine();
            rightSide = Integer.parseInt(input);
            System.out.print("Input third size's length: ");
            input = reader.readLine();
            downSide = Integer.parseInt(input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        figure = new Triangle(leftSide,rightSide,downSide);
        return figure.area();
    }
}
