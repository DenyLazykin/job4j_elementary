package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(5000);
        System.out.println("5000 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(5000);
        System.out.println("5000 rubles are " + dollar + " dollar.");
    }
}
