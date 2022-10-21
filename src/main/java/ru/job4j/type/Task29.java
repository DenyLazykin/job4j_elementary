package ru.job4j.type;

public class Task29 {
    public static void numSum(int number) {
        int num1, num2, num3;
        int temp = number / 10;

        num1 = temp / 10;
        num2 = temp % 10;
        num3 = number % 10;
        int rsl = num1 + num2 + num3;
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        numSum(325);
    }
}
