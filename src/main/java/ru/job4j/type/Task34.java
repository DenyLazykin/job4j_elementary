package ru.job4j.type;

public class Task34 {
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;
        int temp = number / 10;
        int temp2 = temp / 10;
        num1 = temp2 / 10;
        num2 = temp2 % 10;
        num3 = temp % 10;
        num4 = number % 10;
        if (num1 % 2 == 0) {
            counter++;
        }
        if ((num2 % 2 == 0)) {
            counter++;
        }
        if ((num3 % 2 == 0)) {
            counter++;
        }
        if (num4 % 2 == 0) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        evenAmount(4012);
    }
}
