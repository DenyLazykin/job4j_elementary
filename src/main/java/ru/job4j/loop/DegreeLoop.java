package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int rsl = 1;
        for (int i = rsl; i <= n; i++) {
            rsl *= a;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(calculate(3, 1));
    }
}
