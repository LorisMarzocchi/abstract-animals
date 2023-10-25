package org.lessons.java.animals;

public class Bird extends Animals implements CanFly{
    @Override
    public void eat() {
        System.out.println("Semi");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cip Cip");
    }

    @Override
    public void fly() {
        System.out.println("sono un uccello e posso volare");
    }
}
