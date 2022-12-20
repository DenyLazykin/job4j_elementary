package ru.job4j.type;

public class Task37 {
    /**
     * Перемещает цифры числа на одну позицию влево.
     *
     * @param number Целое положительное трехзначное число.
     */
    public static void leftShift(int number) {
        System.out.println((number % 100) * 10);
    }
}
