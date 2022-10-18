package ru.job4j.loop;

public class Task15 {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        for (int i = b; i > a; i--) {
            if (i > 99 && i < 1000 && i != a + 1) {
                System.out.print(i + " ");
            } else if (i > 99 && i < 1000) {
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop(-5, 104);
    }
}

