package org.lessons.java.creator;

public class Creator {

    private Creator() {
        //impedisce la creazione di oggetti di tipo Creator
    }

    public static Device create(String scelta){  //String scelta

        switch (scelta){
//            case 1:
            case "DvdPlayer":
                return new DvdPlayer();
//            case 2:
            case "PlayStation":
                return new PlayStation();

            default:
                throw new IllegalArgumentException("Scelta non valida: " + scelta);
        }

    }
}
