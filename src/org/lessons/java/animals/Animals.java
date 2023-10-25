package org.lessons.java.animals;

public abstract class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void sleep(){
        System.out.println("zzzzzzz");
    }
//    public void eat(String what){
//        System.out.println("mangio" + what);
//    }

    public abstract void eat();
    public abstract void makeNoise();

}
