package Briscola;

import Library.Mazzo;

public class MazzoBriscola extends Mazzo {

    @Override
    public void creaDeck() {
        while (mazzo.size() < 40) {
            for (int i = 0; i <= 9; i++) {
                int puntivaluta = 0;
                if (i == 0)
                    puntivaluta = 11;
                if (i == 1)
                    puntivaluta = 10;
                if (i == 2)
                    puntivaluta = 4;
                if (i == 3)
                    puntivaluta = 3;
                if (i == 4)
                    puntivaluta = 2;

                mazzo.push(new CartaBriscola(Seme.BASTONI, i, puntivaluta));
                mazzo.push(new CartaBriscola(Seme.COPPE, i, puntivaluta));
                mazzo.push(new CartaBriscola(Seme.SPADE, i, puntivaluta));
                mazzo.push(new CartaBriscola(Seme.DANARI, i, puntivaluta));
            }

        }
    }

    public Seme getBriscSeme() {
        return this.mazzo.lastElement().getSeme();
    }
}
