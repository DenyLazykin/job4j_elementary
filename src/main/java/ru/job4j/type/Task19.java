package ru.job4j.type;

public class Task19 {
    public static void sumAndConvert(double money, double gift, double ratio) {
        double euro = ratio * (money + gift);
        System.out.printf("%.2f", euro);
    }
}
