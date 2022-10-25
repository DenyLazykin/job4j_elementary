package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLowerCase;

public class JavaNameValidator {
    /**
     * Метод проверяет валидность имен
     * @param name название, которое нужно проверить
     * @return возвращаем true, если всё верно
     */
    public static boolean isNameValid(String name) {
        boolean result = !name.isEmpty()
                && isLowerCase(name.codePointAt(0));
        if (result) {
            for (int i = 1; i < name.length(); i++) {
                int noValid = name.codePointAt(i);
                if (!isSpecialSymbol(noValid)
                        && !isUpperLatinLetter(noValid)
                        && !isLowerLatinLetter(noValid)
                        && !isDigit(noValid)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Метод проверяет символ
     * @param code код символа
     * @return true, если символ является символом доллара и нижнее подчеркивание
     */
    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    /**
     * Метод проверяет символ
     * @param code код символа
     * @return true, если символ является прописным латинским символом
     */
    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 90;
    }

    /**
     * Метод проверяет символ
     * @param code код символа
     * @return true, если символ является строчным латинским символом
     */
    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}