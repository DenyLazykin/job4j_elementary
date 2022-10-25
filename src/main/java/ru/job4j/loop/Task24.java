package ru.job4j.loop;

public class Task24 {
    public static void loop(int num) {
        for (int i = num - 10; i <= num + 6; i -= 6) {
            if (i < num - 34) {
                break;
            }
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        loop(20);
    }
}
