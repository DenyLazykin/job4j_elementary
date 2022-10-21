package ru.job4j.array;

public class Task69 {
    public static void array(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int element = arr[i];
            System.out.print(element + " ");
        }
    }
}
