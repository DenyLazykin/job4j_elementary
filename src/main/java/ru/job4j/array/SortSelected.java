package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    /**
     * Метод сортирует массив выборкой
     * Смысл метода в поиске минимального элемента из осавшихся
     * @param data массви чисел
     * @return отсортированный по возрастанию массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[]{3, 5, 1};
        System.out.println(Arrays.toString(sort(data)));

    }
}
