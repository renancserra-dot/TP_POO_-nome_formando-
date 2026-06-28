package Main_Stage;

import Need_For_Speed_Underground2.Jogo;
import Need_For_Speed_Underground2.Piloto;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Piloto piloto = jogo.criarPiloto();
        jogo.simuladorCorridas(piloto);
    }
}
