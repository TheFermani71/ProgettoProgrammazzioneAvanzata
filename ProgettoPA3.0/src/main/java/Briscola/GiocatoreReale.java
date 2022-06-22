package Briscola;


import java.util.Scanner;

public class GiocatoreReale extends GiocatoreBriscola {

    public int getSceltaCarta() {
        System.out.println("Pick a card to play");
        while (true) {
            int scelta = new Scanner(System.in).nextInt();
            if (scelta >= 1 && scelta <= 3) {
                return scelta;
            } else
                System.out.println("Please use {1,2,3} to pick a card ");
        }
    }

    public void stampaMano() {
        System.out.println("Cards in hand: ");
        for (int i = 0; i < getMano().size(); i++) {
            System.out.println((i + 1) + ") " + getMano().get(i).toString());
        }
    }


    @Override
    public String nomeGiocatore() {
        return System.getProperty("user.name");
    }

}
