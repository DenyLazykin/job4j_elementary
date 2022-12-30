package ru.job4j.loop;

public class Task24 {
    public static void loop(int num) {
        int i = num - 10;
        while (i <= num + 6) {
            if (i < num - 34) {
                break;
            }
            System.out.print(i + " ");
            i -= 6;
        }
    }

    public static void main(String[] args) {
        loop(20);
    }
}
