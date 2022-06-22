package Briscola;

import Library.Carta;

public class CartaBriscola extends Carta {

    private final int puntiValuta;

    public CartaBriscola(Seme seme, int rango, int puntiValuta) {
        super(seme, rango);
        this.puntiValuta = puntiValuta;
    }

    public int getRango() {
        return rango;
    }

    public int getPuntiValuta() {
        return puntiValuta;
    }

    @Override
    public String toString() {
        return rangoToString() + " di " + semeToString();
    }

    public String semeToString() {
        switch (this.seme) {
            case COPPE:
                return "Coppe";
            case SPADE:
                return "Spade";
            case DANARI:
                return "Danari";
            case BASTONI:
                return "Bastoni";
        }
        return "Error";
    }


    public String rangoToString() {
        switch (this.rango) {
            case 0:
                return "Asso";
            case 1:
                return "Tre";
            case 2:
                return "Re";
            case 3:
                return "Cavallo";
            case 4:
                return "Fante";
            case 5:
                return "Sette";
            case 6:
                return "Sei";
            case 7:
                return "Cinque";
            case 8:
                return "Quattro";
            case 9:
                return "Due";
        }
        return "Error";
    }
}
