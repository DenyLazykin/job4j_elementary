package ru.job4j.type;

public class Task33 {
    public static void evenAmount(int number) {
        int num1, num2, num3, counter = 0;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 100 % 10;
        if (num1 % 2 == 0) {
            counter++;
        }
        if ((num2 % 2 == 0)) {
            counter++;
        }
        if ((num3 % 2 == 0)) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        evenAmount(650);
    }
}
