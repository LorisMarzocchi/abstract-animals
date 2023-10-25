package org.lessons.java.creator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli: 1-DvdPlayer - 2-PlayStation");
//        int scelta = scanner.nextInt();
        String scelta = scanner.nextLine();
//        scanner.nextLine();


        Device dispositivo = Creator.create(scelta);
        dispositivo.play();
        dispositivo.stop();
//        Device dvdPlayer = Creator.create(1);
//        dvdPlayer.play();
//        dvdPlayer.stop();
//
//        Device playStation = Creator.create(2);
//        playStation.play();
//        playStation.stop();
    }
}
