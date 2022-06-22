package Library;

import Briscola.Seme;


public abstract class Carta implements ICarta {

    protected final Seme seme;
    protected final int rango;

    public Carta(Seme seme, int rango) {
        this.seme = seme;
        this.rango = rango;
    }


    public Seme getSeme() {
        return seme;
    }

}
