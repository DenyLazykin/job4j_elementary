package ru.job4j.loop;

public class Task19 {
    public static void loop() {
        System.out.println("Старт");
        for (int i = 100; i < 153; i++) {
            int num3 = i % 10;
            if (num3 == 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Финиш");
    }
}
