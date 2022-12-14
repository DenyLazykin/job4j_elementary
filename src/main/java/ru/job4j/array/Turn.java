package ru.job4j.array;

public class Turn {
    /**
     * Метод переворачивает элементы массива в обратном порядке
     *
     * @param array массив чисел
     * @return отсортированный массив
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
        return array;
    }
}
