package Veiculos;

import PimpMyRide.Habilidade;

import java.util.ArrayList;

public class Mota extends Veiculo{

    private ArrayList<Habilidade> habilidadesMota;

    public Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, ArrayList<Habilidade> habilidadesMota) {
        super(marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.habilidadesMota = habilidadesMota;
    }
}
