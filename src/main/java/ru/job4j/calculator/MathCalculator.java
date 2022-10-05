package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sum(10, 20));
        System.out.println("Результат расчета равен: " + multiply(10, 20));
        System.out.println("Результат расчета равен: " + difference(10, 20));
        System.out.println("Результат расчета равен: " + division(10, 20));
        System.out.println("Результат расчета равен: " + sumDifAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAllOperations(10, 20));
    }
}
