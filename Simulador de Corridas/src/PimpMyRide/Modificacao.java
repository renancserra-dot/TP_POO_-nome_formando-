package PimpMyRide;

import java.util.ArrayList;

public class Modificacao extends ItemCorrida {

    private String nome;
    private int precoFichasCorrida;
    private int diminuicaoDesgaste;
    private double diminuicaoPeso;
    private ArrayList<String> carrosPermitidos;

    public Modificacao(String nome, int precoFichasCorrida, String nome1, int precoFichasCorrida1, double diminuicaoPeso, int diminuicaoDesgaste, ArrayList<String> carrosPermitidos) {
        super(nome, precoFichasCorrida);
        this.nome = nome1;
        this.precoFichasCorrida = precoFichasCorrida1;
        this.diminuicaoPeso = diminuicaoPeso;
        this.diminuicaoDesgaste = diminuicaoDesgaste;
        this.carrosPermitidos = carrosPermitidos;
    }

    public void exibirDetalhes() {

        System.out.println("---- Detalhes para Modificação ----");
        System.out.println("Nome: " + this.nome + " | Preço em fichas de corrida: " + this.precoFichasCorrida + " .€ | Desgaste: " + this.diminuicaoDesgaste + " Peso: " + this.diminuicaoPeso + " .Kg");
    }
}
