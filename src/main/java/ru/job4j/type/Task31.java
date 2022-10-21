package ru.job4j.type;

public class Task31 {
    public static void difference(int number) {
        int num1, num2, num3;
        int temp = number / 10;

        num1 = temp / 10;
        num2 = temp % 10;
        num3 = number % 10;
        int rsl = Math.abs(num1 - num3) * num2;
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        difference(235);
    }
}
