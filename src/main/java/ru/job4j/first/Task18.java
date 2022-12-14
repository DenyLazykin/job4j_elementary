package ru.job4j.first;

import java.util.Scanner;

/**
 * Дана сторона квадрата a. Найти его периметр.
 * Дан радиус окружности r. Найти длину окружности и площадь круга.
 * Результат каждого вычисления выводите в новой строке с точностью до десятых.
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r  = input.nextDouble();
        double squarePerimeter = a * 4;
        String resultSquarePerimeter = String.format("%.1f", squarePerimeter);
        double circleLength = 2 * Math.PI * r;
        String resultCircleLength = String.format("%.1f", circleLength);
        double circleArea = Math.PI * Math.pow(r, 2);
        String resultCircleArea = String.format("%.1f", circleArea);
        System.out.println(resultSquarePerimeter);
        System.out.println(resultCircleLength);
        System.out.println(resultCircleArea);
    }
}
