package ru.job4j.condition;

public class Max {
    /**
     * Находит максимум из 2ух чисел
     * @param left число 1
     * @param right число 2
     * @return результат сравнения
     */
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    /**
     * Находит максимум из 3ех чисел
     * @param first число 1
     * @param second число 2
     * @param third число 3
     * @return результат сравнения
     */
    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    /**
     * Находит максимум из 4ех чисел
     * @param first число 1
     * @param second число 2
     * @param third число 3
     * @param four число 4
     * @return результат сравнения
     */
    public static int max(int first, int second, int third, int four) {
        return max(max(first, second, third), four);
    }
}
