package Veiculos;

import Enums.TipoCarro;
import PimpMyRide.Modificacao;

import java.util.ArrayList;

public class Carro extends Veiculo {

    private TipoCarro tipoCarro;
    private ArrayList<Modificacao> kitCorrida;

    public Carro(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro) {
        super(marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoCarro = tipoCarro;
        this.kitCorrida = new ArrayList<>();
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public ArrayList<Modificacao> getKitCorrida() {
        return kitCorrida;
    }

    public void aplicarModificacao(Modificacao modificacao) {

        if (modificacao.getCarrosPermitidos().isEmpty()
                || modificacao.getCarrosPermitidos().contains(this.tipoCarro.name())) {

            this.kitCorrida.add(modificacao);
            this.adicionarItem(modificacao);
            this.setPesoKg(Math.max(0, this.getPesoKg() - modificacao.getDiminuicaoPeso()));
            this.setDesgaste(Math.max(0, this.getDesgaste() - modificacao.getDiminuicaoDesgaste()));

            System.out.println("Modificação " + modificacao.getNome() + " aplicada com sucesso ao " + this.modelo + ".");
        } else {
            System.out.println("Este carro não é compatível com a modificação " + modificacao.getNome() + ".");
        }
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tipo de Carro: " + this.tipoCarro + " | Kit de corrida: " + this.kitCorrida.size() + " modificações");
    }
}