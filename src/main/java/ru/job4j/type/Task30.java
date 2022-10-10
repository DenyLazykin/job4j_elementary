package ru.job4j.type;

public class Task30 {
    public static void difference(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        int rsl = Math.abs(num1 - num2);
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        difference(25);
    }
}
