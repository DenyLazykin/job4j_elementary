package ru.job4j.condition;

public class Task17 {
    public static void signCheck(int number) {
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number == 0) {
            System.out.println("Ноль");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void main(String[] args) {
        signCheck(12);
        signCheck(0);
        signCheck(-12);
    }
}
