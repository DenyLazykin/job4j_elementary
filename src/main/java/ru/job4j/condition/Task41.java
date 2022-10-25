package ru.job4j.condition;

public class Task41 {
    public static void evenDigitsAmount(int number) {
        int num1, num2, num3;
        int temporary = number / 10;
        int counter = 0;
        num1 = temporary / 10;
        num2 = temporary % 10;
        num3 = number % 10;
        if (num1 % 2 == 0) {
            counter++;
        }
        if (num2 % 2 == 0) {
            counter++;
        }
        if (num3 % 2 == 0) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        evenDigitsAmount(320);
    }
}
