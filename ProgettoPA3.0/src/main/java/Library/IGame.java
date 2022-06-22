package Library;

import Briscola.GiocatoreBriscola;

public interface IGame {

    void playGame();

    int confrontoPunti(GiocatoreBriscola[] playersArray);
}
