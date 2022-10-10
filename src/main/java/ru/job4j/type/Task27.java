package ru.job4j.type;

public class Task27 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 100 % 10;
        int rsl = Integer.parseInt(num3 + "" + num2 + "" + num1);
        System.out.println(rsl - 20);
    }

    public static void main(String[] args) {
        transform(327);
    }
}
