package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(41, 14, 23, 32);
        System.out.println("result (41, 14) to (23, 32) " + result);
    }
}
