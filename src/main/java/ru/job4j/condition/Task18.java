package ru.job4j.condition;

public class Task18 {
    public static void numDecrease(int number) {
        if (number > 99) {
            System.out.println(number - 1);
        } else {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        numDecrease(100);
        numDecrease(98);
    }
}
