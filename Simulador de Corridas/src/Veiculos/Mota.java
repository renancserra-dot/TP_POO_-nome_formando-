package Veiculos;

import Enums.TipoMoto;
import PimpMyRide.Habilidade;

import java.util.ArrayList;

public class Mota extends Veiculo{

    private TipoMoto tipoMoto;
    private ArrayList<Habilidade> habilidadesMota;

    public Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoMoto tipoMoto) {
        super(marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoMoto = tipoMoto;
    }
}
