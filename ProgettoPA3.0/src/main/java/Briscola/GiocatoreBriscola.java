package Briscola;

import Library.Giocatore;

public abstract class GiocatoreBriscola extends Giocatore {

    private int punti;

    public GiocatoreBriscola() {
        this.punti = 0;
    }

    public void ScoreUp(int pointsToAdd) {
        this.punti += pointsToAdd;
    }

    public int getPunti() {
        return punti;
    }

    public abstract String nomeGiocatore();



}
