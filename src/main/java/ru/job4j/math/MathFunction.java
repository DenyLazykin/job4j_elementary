package ru.job4j.math;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double difference(double first, double second) {
        return first - second;
    }

    public static double division(double first, double second) {
        return first / second;
    }

    public static double sumDifAndDiv(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return difference(first, second)
                + division(first, second)
                + multiply(first, second)
                + sum(first, second);
    }
}
