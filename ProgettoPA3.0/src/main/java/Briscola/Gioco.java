package Briscola;

import Library.IGame;


public class Gioco implements IGame {

    private Seme trump;


    public void playGame() {

        int nPlayers = 2;
        int turni = 40 / nPlayers;
        MazzoBriscola mazzo = new MazzoBriscola() ;
        mazzo.creaDeck();
        mazzo.shuffle();
        trump = mazzo.getBriscSeme();

        GiocatoreBriscola[] ArrayGiocatori = new GiocatoreBriscola[nPlayers];
        GiocatoreReale giocatore = new GiocatoreReale();
        ArrayGiocatori[0] = giocatore;
        CPU cpu = new CPU();
        ArrayGiocatori[1] = cpu;

        int puntatore = 0;

        //Each giocatore draws opening hand
        for (int i = 0; i < nPlayers * 3; i++) {
            int j = (i + puntatore) % nPlayers;
            ArrayGiocatori[j].pescaCarta(mazzo.pescaPrimaCarta());
        }

        int primo = puntatore;

        while (turni > 0) {

            System.out.println("-----------------------------");
            System.out.println("Turn " + (21 - turni) + ", Trump is: " + this.trump);
            System.out.println(ArrayGiocatori[puntatore].nomeGiocatore() + " begins primo");
            System.out.println("-----------------------------");
            int puntiGioco = 0;
            CartaBriscola[] ArrayCarte = new CartaBriscola[nPlayers];

            for (int i = 0; i < nPlayers; i++) {
                ArrayGiocatori[puntatore].stampaMano();
                ArrayCarte[i] = (CartaBriscola) ArrayGiocatori[puntatore].giocaCarta();
                System.out.println(ArrayGiocatori[puntatore].nomeGiocatore() + " played " + ArrayCarte[i].toString());
                puntiGioco += ArrayCarte[i].getPuntiValuta();
                puntatore = (puntatore + 1) % nPlayers;
            }

            primo = (primo + ProssPrimo(ArrayCarte)) % nPlayers;

            ArrayGiocatori[primo].ScoreUp(puntiGioco);

            if (!mazzo.isEmpty()) {
                for (int i = 0; i < nPlayers; i++) {
                    int j = (primo + i) % nPlayers;
                    ArrayGiocatori[j].pescaCarta(mazzo.pescaPrimaCarta());
                }
            }
            puntatore = primo;
            turni--;
        }

        int vincitore = confrontoPunti(ArrayGiocatori);
        System.out.println("==============================");
        System.out.println("\nWinner is: " + ArrayGiocatori[vincitore].nomeGiocatore() + " with " + ArrayGiocatori[vincitore].getPunti() + " points!");
        System.out.println("\n==============================");

    }

    public int confrontoPunti(GiocatoreBriscola[] playersArray) {
        int massimo = 0;
        int puntatore = 0;
        for (int i = 0; i < playersArray.length; i++) {
            if (playersArray[i].getPunti() > massimo) {
                massimo = playersArray[i].getPunti();
                puntatore = i;
            }
        }
        return puntatore;
    }

    public int ProssPrimo(CartaBriscola[] carta) {
        int contatore = 0;
        for (int i = 0; i < carta.length - 1; i++) {
            CartaBriscola a = carta[i];
            CartaBriscola b = carta[i + 1];
            if (!confrontaCarte(a, b)) {
                contatore++;
            }
        }
        return contatore;
    }

    public boolean confrontaCarte(CartaBriscola a, CartaBriscola b) {
        if (a.getSeme() == b.getSeme())
            return a.getRango() < b.getRango();
        return b.getSeme() != this.trump;
    }
}