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
        float inE = 140;
        float expectedE = 2;
        float outE = Converter.rubleToEuro(inE);
        boolean passedE = expectedE == outE;
        System.out.println("140 rubles are 2. Test result : " + expectedE);
        float inD = 180;
        float expectedD = 3;
        float outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("180 rubles are 3. Test result : " + expectedD);
    }
}
