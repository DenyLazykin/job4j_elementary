package ru.job4j.loop;

public class Task20 {
    public static void loop() {
        System.out.println("Начало");
        for (int i = 1550; i >= 1050; i--) {
            int temp = i / 10;
            int num3 = temp % 10;
            int num4 = i % 10;
            if (num4 == 0 && num3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Конец");
    }
}
