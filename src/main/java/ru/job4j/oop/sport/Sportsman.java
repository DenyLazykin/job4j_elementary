package ru.job4j.oop.sport;

public abstract class Sportsman {
    int runSpeed;

    abstract void run();

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }
}
