package ru.job4j.array;

public class StringUsage {
    public static void main(String[] args) {
        /* String.toCharArray() */
        String toCharArray = "Smith Will";
        char[] toCharArray1 = toCharArray.toCharArray();
        System.out.println(toCharArray1);
        System.out.println();
        /* String.valueOf() */
        char[] valueOf = {'j', 'o', 'b', '4', 'j'};
        String valueOf1 = String.valueOf(valueOf);
        System.out.println(valueOf1);
        System.out.println();
        /* String.charAt() */
        String charAt = "Smith Will";
        char charAt1 = charAt.charAt(6);
        System.out.println(charAt1);
        System.out.println();
        /* String.indexOf() */
        String indexOf = "Smith Will";
        String subtext = "Wi";
        int indexOf1 = indexOf.indexOf(subtext);
        System.out.println(indexOf1);
        System.out.println();
        /* String.indexOf() с двумя параметрами. 1ый - то, что ищем. 2ой - то, где ищем. */
        String indexOf2Parameters = "Smith Will, He has a friend William.";
        String indexOf2Parameters1 = "Wi";
        int index = indexOf2Parameters.indexOf(indexOf2Parameters1, 7);
        System.out.println(index);
        System.out.println();
        /* String.substring(fromIndex, toIndex) */
        String substring = "will_smith@gmail.com";
        int fromIndex = substring.indexOf("@") + 1;
        int toIndex = substring.length();
        String domain = substring.substring(fromIndex, toIndex);
        System.out.println(domain);
        System.out.println();
        /* String.codeAt() */
        validatePhone("123456789");
        validatePhone("123-456-789");
    }

    /*
    Метод проверяет состоит ли строка только из цифр
     */
    public static void validatePhone(String phone) {
        boolean valid = true;
        for (int i = 0; i < phone.length(); i++) {
            int code = phone.codePointAt(i);
            if (code < 48 || code > 57) {
                valid = false;
                break;
            }
        }
        System.out.println(phone + " is " + ((valid) ? "correct" : "not correct"));
    }
}
