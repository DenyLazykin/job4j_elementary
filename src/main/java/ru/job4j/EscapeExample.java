package ru.job4j;

public class EscapeExample {
    public static void main(String[] args) {
        String str = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(str);
        char escape = '\"';
        System.out.println(escape);
        System.out.println("Одинарная кавычка: " + '\'');
        System.out.println("Как добавить обратный слэш: " + "C:\\projects\\job4j\\File.java");
        System.out.println("Возвращает курсор в начало строки - '\r'");
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        System.out.print("Перевод курсора\nНа новую строку");
        System.out.println();
        System.out.println("Без отступа");
        System.out.println("\tОдин отстпуп");
        System.out.println("\t\tДва отстпупа");
        System.out.println("Стираем лишние символыыы\b\b");
    }
}
