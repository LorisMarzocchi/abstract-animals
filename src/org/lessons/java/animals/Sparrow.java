package org.lessons.java.animals;

public class Sparrow extends Animals implements CanFly{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("seeds");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cip Cip");
    }
    @Override
    public void fly() {
        System.out.println("i am a sparrow and i can fly");
    }
}
