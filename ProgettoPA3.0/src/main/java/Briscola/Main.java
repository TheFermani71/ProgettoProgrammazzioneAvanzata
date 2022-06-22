package Briscola;


public class Main {

    public static Comandi io = new Comandi();

    public static void main(String[] args) {

        boolean usci = false;
        while (!usci) {
            int scelta = io.menu();
            switch (scelta) {
                case 1:
                    Gioco gioco = new Gioco();
                    gioco.playGame();
                    break;
                case 2:
                    io.stampaRegole();
                    break;
                case 3:
                    usci = true;
                    break;

            }
        }

    }




}
