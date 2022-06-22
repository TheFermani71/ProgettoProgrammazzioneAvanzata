package Library;

import java.util.ArrayList;
import java.util.List;


public abstract class Giocatore {

    protected final List<Carta> mano;

    public Giocatore() {
        this.mano = new ArrayList<>();
    }

    public void pescaCarta(Carta carta) {
        mano.add(carta);
    }

    public abstract void stampaMano();


    public List<Carta> getMano() {
        return mano;
    }

    public Carta giocaCarta() {
        Carta prendiCarta = mano.get(getSceltaCarta() - 1);
        mano.remove(prendiCarta);
        return prendiCarta;
    }

    protected abstract int getSceltaCarta();

    public int carteInMano() {
        return this.mano.size();
    }

}
