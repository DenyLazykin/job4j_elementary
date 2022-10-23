package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    /*
    Метод реализует механизм возврата монет в вендинговых аппаратах (жадный алгоритм)
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cash = money - price;
        for (int coin : coins) {
            while (cash >= coin) {
                cash = cash - coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
