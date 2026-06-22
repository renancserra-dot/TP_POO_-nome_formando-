package Veiculos;

import Enums.TipoMoto;
import PimpMyRide.Habilidade;

import java.util.ArrayList;

import static Enums.TipoMoto.*;
import static Enums.TipoMoto.ATV;
import static Enums.TipoMoto.CHOPPER;
import static Enums.TipoMoto.CRUISER;
import static Enums.TipoMoto.MOTOCROSS;
import static Enums.TipoMoto.SCOOTER;
import static Enums.TipoMoto.SPORT_BIKE;
import static Enums.TipoMoto.STANDARD;

public class Mota extends Veiculo{

    private TipoMoto tipoMoto;
    private ArrayList<Habilidade> habilidadesMota;

    public Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoMoto tipoMoto) {
        super(marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoMoto = tipoMoto;
    }



}
