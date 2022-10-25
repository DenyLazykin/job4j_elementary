package ru.job4j.condition;

public class Task43 {
    public static void containsZero(int number) {
        int temp = number / 10;
        int num1 = temp / 10;
        int num2 = temp % 10;
        int num3 = number % 10;
        System.out.println(num3 == 0
                || num2 == 0
                || num1 == 0 ? "Да" : "Нет");
    }
}
