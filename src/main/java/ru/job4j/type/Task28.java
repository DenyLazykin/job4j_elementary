package ru.job4j.type;

public class Task28 {
    public static void numSum(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        int rsl = num1 + num2;
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        numSum(35);
    }
}
