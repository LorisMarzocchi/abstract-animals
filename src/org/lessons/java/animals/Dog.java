package org.lessons.java.animals;

public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kibble");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bau");
    }
}
