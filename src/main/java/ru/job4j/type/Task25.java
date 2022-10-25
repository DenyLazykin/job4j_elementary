package ru.job4j.type;

public class Task25 {
    public static void separate(int number) {
        int num1, num2, num3;
        int temp = number / 10;
        num1 = temp / 10;
        num2 = temp % 10;
        num3 = number % 10;
        System.out.println(num1 + "+" + num2 + "+" + num3);
    }

    public static void main(String[] args) {
        separate(760);
    }
}
