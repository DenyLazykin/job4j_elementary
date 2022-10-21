package ru.job4j.array;

public class Check {
    /*
    Метод проверяет, что все элементы либо true либо false
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;

    }
}

