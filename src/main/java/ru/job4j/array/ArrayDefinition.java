package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);

        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);

        String[] names = new String[4];
        names[0] = "Денис";
        names[1] = "Настя";
        names[2] = "Тема";
        names[3] = "Даник";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);

        int[] ints = new int[10];
        System.out.println("Размер массива ints равен: " + ints.length);

        int[] nums = new int[5];
        nums[0] = 2006;
        nums[1] = 2010;
        nums[2] = 2014;
        nums[3] = 2018;
        nums[4] = 2022;
        int years = nums[3];
        System.out.println(years);

        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
