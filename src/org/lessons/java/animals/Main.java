package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {

        Dog pippo = new Dog("Pippo");
        Dolphin flipper = new Dolphin("Flipper");
        Eagle freddy = new Eagle("Freddy");
        Sparrow sparrow = new Sparrow("Pino");

        Animals[] animals = {pippo, flipper, freddy, sparrow};
        for (Animals animal : animals) {
            System.out.println("My name is: " + animal.getName());
            animal.makeNoise();
            animal.eat();
            animal.sleep();

            if (animal instanceof CanFly) {
                faiVolare((CanFly) animal);
            }
            if (animal instanceof CanSwim) {
                faiNuotare((CanSwim) animal);
            }
            System.out.println("*************** \n");
        }

    }
    public static void faiVolare(CanFly animals){
        animals.fly();
    }
    public static void faiNuotare(CanSwim animals) {
        animals.swim();
    }
}
