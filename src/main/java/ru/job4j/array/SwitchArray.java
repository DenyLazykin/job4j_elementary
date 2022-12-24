package ru.job4j.array;

public class SwitchArray {
    /**
     * Метод меняет местами указаные нами (source и dest) элементы в массиве
     *
     * @param array  массив с числами
     * @param source первый элемент который меняем
     * @param dest   второй элемент который меняем
     * @return отсортированный массив
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * Метод меняет местами нулевой и последний элементы в массиве
     *
     * @param array массив с числами
     * @return отсортированный массив
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}
