package org.lessons.java.animals;

public class Dolphin extends Animals implements CanSwim{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }

    @Override
    public void makeNoise() {
        System.out.println("Clipppppp");
    }

    @Override
    public void swim() {
        System.out.println("i am a dolphin and i can swim");
    }
}
