package Library;

import java.util.Collections;
import java.util.Stack;

public abstract class Mazzo implements IMazzo {

    protected final Stack<Carta> mazzo;

    public Mazzo() {
        this.mazzo = new Stack<>();
    }

    public void shuffle() {
        Collections.shuffle(this.mazzo);
    }

    public abstract void creaDeck();

    public Carta pescaPrimaCarta() {
        return this.mazzo.pop();
    }

    public boolean isEmpty(){
        return mazzo.isEmpty();
    }

}
