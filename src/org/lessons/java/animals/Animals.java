package org.lessons.java.animals;

public abstract class Animal {

    public void dormi(){
        System.out.println("zzzzzzz");
    }
    public void eat(String what){
        System.out.println("mangio" + what);
    }

    public abstract void makeNoise();

}
