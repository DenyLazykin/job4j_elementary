package ru.job4j.condition;

public class Task40 {
    public static void isDoubleEven(int number) {
        int num1, num2, num3;
        int temporary = number / 10;
        num1 = temporary / 10;
        num2 = temporary % 10;
        num3 = number % 10;
        System.out.println(number % 2 == 0
                && (num1 + num2 + num3) % 2 == 0
                ? "Да" : "Нет");
    }
}
