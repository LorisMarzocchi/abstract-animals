package org.lessons.java.creator;

public class DvdPlayer implements Device {
//
    @Override
    public void play() {
        System.out.println("Lettore DVD modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Lettore DVD modalità stop");
    }
}
