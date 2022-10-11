package ru.job4j.condition;

public class Task16 {
    public static void zeroCheck(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Not zero");
        }
    }

    public static void main(String[] args) {
        zeroCheck(0);
        zeroCheck(-32);
    }
}
