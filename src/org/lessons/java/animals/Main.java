package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {

        Dog pippo = new Dog("pippo");
        Dolphin flipper = new Dolphin("flipper");
        Eagle freddy = new Eagle("freddy");
        Sparrow sparrow = new Sparrow("pino");

        Animals[] animals = {pippo, flipper, freddy, sparrow};
        for (Animals animal : animals) {
            System.out.println("mi chiamo: " + animal.getName());
            animal.makeNoise();
            animal.eat();
            animal.sleep();

            if (animal instanceof CanFly) {
                faiVolare((CanFly) animal);
            }
            if (animal instanceof CanSwim) {
                faiNuotare((CanSwim) animal);
            }
        }

    }
    public static void faiVolare(CanFly animals){
        animals.fly();
    }
    public static void faiNuotare(CanSwim animals) {
        animals.swim();
    }
}
