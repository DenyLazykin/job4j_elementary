package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int result = 0;
        while (length >= section) {
            result++;
            length -= section;
        }
        return result;
    }

}
