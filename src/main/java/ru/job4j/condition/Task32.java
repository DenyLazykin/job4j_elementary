package ru.job4j.condition;

public class Task32 {
    public static void calculate(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 - num2);
        }
        if (num1 < num2) {
            System.out.println(num2 - num1);
        }
        if (num1 == num2) {
            System.out.println(num1 * num2);
        }
    }

    public static void main(String[] args) {
        calculate(2, 5);
    }
}
