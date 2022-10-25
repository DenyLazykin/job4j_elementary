package ru.job4j.array;

public class MinDiapason {
    /**
     * Метод находит миниманое значение в массиве, в диапазоне от start до finish
     * @param array массив чисел
     * @param start индекс, с которого начинаем поиск
     * @param finish индекс, которым заканчиваем поиск
     * @return минимальный элемент найденный в диапазоне
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
