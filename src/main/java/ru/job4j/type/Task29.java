package ru.job4j.type;

public class Task29 {
    public static void numSum(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 100 % 10;
        int rsl = num1 + num2 + num3;
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        numSum(325);
    }
}
