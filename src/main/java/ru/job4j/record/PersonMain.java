package ru.job4j.record;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Den", 33);
        System.out.println("Name: "  + person.getName() + ", Age: " + person.getAge());
        System.out.println(person);
        PersonRecord personRecord = new PersonRecord("Den", 33);
        System.out.println("Name: "  + personRecord.name() + ", Age: " + personRecord.age());
        System.out.println(personRecord);
        PersonRecord personRecord1 = new PersonRecord("Den", 33);
        System.out.println(personRecord.equals(personRecord1));
    }
}
