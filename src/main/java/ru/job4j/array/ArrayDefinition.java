package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];

        String[] surnames = new String[100500];

        String[] names = new String[4];
        names[0] = "Денис";
        names[1] = "Настя";
        names[2] = "Тема";
        names[3] = "Даник";

        float[] prices = new float[40];

        int[] ints = new int[10];

        int[] nums = new int[5];
        nums[0] = 2006;
        nums[1] = 2010;
        nums[2] = 2014;
        nums[3] = 2018;
        nums[4] = 2022;
        int years = nums[3];
        System.out.println("Размер массива ints равен: " + ints.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println(years);
        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3]);
    }
}
