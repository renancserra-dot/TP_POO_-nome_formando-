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

    // ---------- MOTAS ----------

    Mota mota1 = new Mota("Honda", "PCX", 75, 30, 50, 1000, CRUISER);
    Mota mota2 = new Mota("Yamaha", "MT-07", 73, 30, 50, 1000, MOTOCROSS);
    Mota mota3 = new Mota("BMW", "R 1250 GS", 96, 30, 50, 1000, SPORT_BIKE);
    Mota mota4 = new Mota("Kawasaki", "Z900", 95, 30, 50, 1000, SCOOTER);
    Mota mota5 = new Mota("Ducati", "Monster", 88, 30, 50, 1000, STANDARD);
    Mota mota6 = new Mota("KTM", "390 Duke", 65, 30, 50, 1000, CHOPPER);
    Mota mota7 = new Mota("Triumph", "Bonneville", 80, 30, 50, 1000, ATV);
    Mota mota8 = new Mota("Suzuki", "Hayabusa", 90, 30, 50, 1000, CRUISER);
    Mota mota9 = new Mota("Harley-Davidson", "Iron 883", 78, 30, 50, 1000, CHOPPER);
    Mota mota10 = new Mota("Aprilia", "RS 660", 100, 30, 50, 1000, MOTOCROSS);
    Mota mota11 = new Mota("Vespa", "GTS 300", 55, 30, 50, 1000, SPORT_BIKE);
    Mota mota12 = new Mota("Benelli", "TRK 502", 65, 30, 50, 1000, SCOOTER);
    Mota mota13 = new Mota("Royal Enfield", "Meteor 350", 72, 30, 50, 1000, ATV);
    Mota mota14 = new Mota("Keeway", "Superlight 125", 62, 30, 50, 1000, STANDARD);

}
