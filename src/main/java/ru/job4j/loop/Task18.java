package ru.job4j.loop;

public class Task18 {
    public static void loop() {
        System.out.println("Начало");
        for (int i = 10; i < 19; i++) {
            if (i % 2 == 0 && i % 4 != 0) {
                System.out.print(i + " ");
            } else if (i % 4 == 0) {
                System.out.print(i + "# ");
            }
        }
        System.out.println();
        System.out.println("Конец");
    }
}
