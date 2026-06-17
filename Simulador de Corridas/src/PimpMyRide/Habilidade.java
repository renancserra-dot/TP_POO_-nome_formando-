package PimpMyRide;

public class Habilidade extends ItemCorrida {

    private int aumentoPotencia;

    public Habilidade(String nome, int precoFichasCorrida, int aumentoPotencia) {
        super(nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }

    public void exibirDetalhes () {

        System.out.println("----- Detalhes de Habilidade -----");
        System.out.println("Nome: " + this.getNome() + " | Aumento de potencia: " + this.aumentoPotencia);
    }
}
