package ru.job4j.loop;

public class Task14 {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        for (int i = a; i < b - 1; i++) {
            if (i > 9 && i < 99) {
                System.out.print(i + " ");
            }
        }
        System.out.println(a < 0 && b < 9 ? "" : b - 1);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop(5, 14);
    }
}
