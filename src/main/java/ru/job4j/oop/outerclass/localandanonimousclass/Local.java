package ru.job4j.oop.outerclass.localandanonimousclass;

public class Local {
    private String name = "Den";

    public void getFullName() {
        final String surname = "Lazykin";

        class Fullname {
            public void printFullName() {
                System.out.println(name + " " + surname);
            }
        }

        Fullname fullname = new Fullname();
        fullname.printFullName();
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.getFullName();
    }
}
