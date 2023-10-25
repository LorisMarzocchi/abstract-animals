package org.lessons.java.animals;

public class Eagle extends Animals implements CanFly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }

    @Override
    public void makeNoise() {
        System.out.println("aaaaaa!");
    }

    @Override
    public void fly() {
        System.out.println("i am eagle and i can fly");
    }
}
