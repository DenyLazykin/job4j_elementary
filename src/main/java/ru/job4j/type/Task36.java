package ru.job4j.type;

public class Task36 {
    public static void firstLastChange(int number) {
        int first, middle, last;
        int temp = number / 10;
        int temp2 = temp / 10;
        first = temp2 / 10;
        middle = 10 * (temp2 % 10) + (temp % 10);
        last = number % 10;
        System.out.println(1000 * last + 10 * middle + first);
    }

    public static void main(String[] args) {
        firstLastChange(1000);
    }
}
