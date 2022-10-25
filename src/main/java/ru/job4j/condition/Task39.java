package ru.job4j.condition;

public class Task39 {
    public static void isSymmetric(int number) {
        int num1, num2, num3;
        int temporary = number / 10;
        num1 = temporary / 10;
        num2 = temporary % 10;
        num3 = number % 10;
        if (num1 == num3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
