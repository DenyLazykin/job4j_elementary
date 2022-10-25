package ru.job4j.array;

public class ArrayChar {
    /**
     * Метод проверяет, что слово начинается с определенной последовательности
     * @param word слово
     * @param pref последовательность символов
     * @return если ячейки из массива pref соответствуют ячейкам в массиве word - возвращаем true
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
