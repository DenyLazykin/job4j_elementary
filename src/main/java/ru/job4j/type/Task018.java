package ru.job4j.type;

import java.util.Scanner;

public class Task018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double squarePerimeter = a * 4;
        String rslSquarePerimeter = String.format("%.1f", squarePerimeter);
        double circleLength = 2 * Math.PI * r;
        String rslCircleLength = String.format("%.1f", circleLength);
        double circleArea = Math.PI * Math.pow(r, 2);
        String rslCircleArea = String.format("%.1f", circleArea);
        System.out.println(rslSquarePerimeter);
        System.out.println(rslCircleLength);
        System.out.println(rslCircleArea);
    }
}
