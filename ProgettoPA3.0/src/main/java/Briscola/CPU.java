package Briscola;

import java.util.Random;


public class CPU extends GiocatoreBriscola {

    public CPU() {
    }

    public void stampaMano() {
    }

    public int getSceltaCarta() {
        return new Random().nextInt(carteInMano()) + 1;
    }

    @Override
    public String nomeGiocatore() {
        return "CPU";
    }

}
