package ru.job4j.oop.outerclass.anonimousclass;

public class BirdMain {
    public static void main(String[] args) {
        Bird parrot = new Bird() {
            @Override
            public void fly() {
                System.out.println("Попугай летит");
            }
        };
        Bird bird = new Bird();
        bird.fly();
        parrot.fly();
    }
}
