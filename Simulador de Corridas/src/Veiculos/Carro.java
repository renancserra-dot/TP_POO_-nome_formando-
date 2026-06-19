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
    }
}