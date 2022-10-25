package ru.job4j.array;

public class EqLast {
    /**
     * Меотод сравнивает последние элементы массивов
     * @param left левый массив
     * @param right правый массив
     * @return true, если элементы равны, если нет - false
     */
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}
