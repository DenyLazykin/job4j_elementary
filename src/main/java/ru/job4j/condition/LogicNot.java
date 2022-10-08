package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean resultIsEven = LogicNot.isEven(13);
        System.out.println(resultIsEven);
        boolean resultIsPositive = LogicNot.isPositive(-23);
        System.out.println(resultIsPositive);
        boolean resultNotEven = LogicNot.notEven(13);
        System.out.println(resultNotEven);
        boolean resultNotPositive = LogicNot.notPositive(23);
        System.out.println(resultNotPositive);
        boolean resultNotEvenAndPositive = LogicNot.notEvenAndPositive(13);
        System.out.println(resultNotEvenAndPositive);
        boolean resultEvenOrNotPositive = LogicNot.evenOrNotPositive(12);
        System.out.println(resultEvenOrNotPositive);
    }
}
