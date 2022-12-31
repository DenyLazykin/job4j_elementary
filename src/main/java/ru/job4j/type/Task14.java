package ru.job4j.type;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double catheterA = input.nextDouble();
        double catheterB = input.nextDouble();
        double hypotenuse = input.nextDouble();
        double perimeter = catheterA + catheterB + hypotenuse;
        double area = 0.5 * (catheterA * catheterB);
        System.out.printf("%.1f%n%.1f", perimeter, area);
    }
}
