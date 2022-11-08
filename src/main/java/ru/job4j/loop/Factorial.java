package ru.job4j.loop;

public class Factorial {
    /**
     * Расчитывает факториал заданного числа
     * @param number число
     * @return факториал числа
     */
    public static int calc(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
