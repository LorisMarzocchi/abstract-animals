package org.lessons.java.creator;

public class PlayStation implements Device {
//

    @Override
    public void play() {
        System.out.println("PlayStation modalità play");
    }

    @Override
    public void stop() {
        System.out.println("PlayStation modalità stop");
    }

}
