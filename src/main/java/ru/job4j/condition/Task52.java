package ru.job4j.condition;

/**
 * Написать код, который проверяет,равны ли эти дроби друг другу,
 * и выводит в консоль "Да", если равны, и "Нет", если не равны.
 */
public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        float resultA = (float) a1 / a2;
        float resultB = (float) b1 / b2;
        if (resultB == resultA) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEquals(3, 3, 8, 8);
        isEquals(2, 5, 6, 15);
        isEquals(1, 3, 2, 6);
        isEquals(1, 3, 1, 4);
        isEquals(2, 7, 3, 8);
        isEquals(8, 3, 11, 4);
    }
}
