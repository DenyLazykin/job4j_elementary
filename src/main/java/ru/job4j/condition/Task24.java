package ru.job4j.condition;

public class Task24 {
    public static void isPositive(int num1, int num2) {
        if (num2 / num1 >= 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
