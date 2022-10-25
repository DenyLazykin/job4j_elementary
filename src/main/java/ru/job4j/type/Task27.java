package ru.job4j.type;

public class Task27 {
    public static void transform(int number) {
        int num1, num2, num3;
        int temp = number / 10;
        num1 = temp / 10;
        num2 = temp % 10;
        num3 = number % 10;
        int rsl = Integer.parseInt(num3 + "" + num2 + "" + num1);
        System.out.println(rsl - 20);
    }

    public static void main(String[] args) {
        transform(327);
    }
}
