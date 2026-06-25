package PimpMyRide;

import java.util.ArrayList;

public class Modificacao extends ItemCorrida {

    private int diminuicaoDesgaste;
    private double diminuicaoPeso;
    private ArrayList<String> carrosPermitidos;

    public Modificacao(String nome, int precoFichasCorrida, int diminuicaoDesgaste, double diminuicaoPeso) {
        super(nome, precoFichasCorrida);
        this.diminuicaoDesgaste = diminuicaoDesgaste;
        this.diminuicaoPeso = diminuicaoPeso;
        this.carrosPermitidos = new ArrayList<>();
    }

    public int getDiminuicaoDesgaste() {
        return diminuicaoDesgaste;
    }

    public void setDiminuicaoDesgaste(int diminuicaoDesgaste) {
        this.diminuicaoDesgaste = diminuicaoDesgaste;
    }

    public double getDiminuicaoPeso() {
        return diminuicaoPeso;
    }

    public void setDiminuicaoPeso(double diminuicaoPeso) {
        this.diminuicaoPeso = diminuicaoPeso;
    }

    public ArrayList<String> getCarrosPermitidos() {
        return carrosPermitidos;
    }

    public void setCarrosPermitidos(ArrayList<String> carrosPermitidos) {
        this.carrosPermitidos = carrosPermitidos;
    }

    public void adicionarCarroPermitido(String tipoCarro) {
        this.carrosPermitidos.add(tipoCarro);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("---- Detalhes da Modificação ----");
        System.out.println("Nome: " + this.getNome()
                + " | Preço em fichas de corrida: " + this.getPrecoFichasCorrida()
                + " | Redução de desgaste: " + this.diminuicaoDesgaste
                + " | Redução de peso: " + this.diminuicaoPeso + " Kg"
                + " | Carros permitidos: " + this.carrosPermitidos);
    }
}
