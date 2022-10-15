package ru.job4j.condition;

public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (chairs > pupils) {
            int n = chairs - pupils;
            System.out.println("Лишних стульев: " + n);
        }
        if (chairs < pupils) {
            int n = pupils - chairs;
            System.out.println("Не хватает стульев: " + n);
        }
        if (chairs == pupils) {
            System.out.println("Соответствует");
        }
    }

    public static void main(String[] args) {
        chairsCheck(12, 10);
    }
}
