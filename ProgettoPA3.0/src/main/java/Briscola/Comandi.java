package Briscola;

import java.util.Scanner;

public class Comandi {

    private final Scanner sc = new Scanner(System.in);


    private int getInt() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Insert Integer please. ");
            }
        }
    }


    public int menu() {
        printMenu();
        int scelta = getInt();
        while (true) {
            if (scelta >= 0 && scelta <= 3)
                return scelta;
            else printMenu();
        }


    }

    private void printMenu() {
        System.out.println("Welcome to the menu, here are your options: ");
        System.out.println("1) Play game");
        System.out.println("2) Read rules");
        System.out.println("3) Quit");
    }

    public void stampaRegole() {
        System.out.println("https://en.wikipedia.org/wiki/Briscola");
    }
}
