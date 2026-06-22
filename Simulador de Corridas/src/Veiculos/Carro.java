package Veiculos;

import Enums.TipoCarro;
import PimpMyRide.Modificacao;

import java.util.ArrayList;

import static Enums.TipoCarro.*;
import static Enums.TipoCarro.CONVERTIBLE;
import static Enums.TipoCarro.F1;
import static Enums.TipoCarro.GT;
import static Enums.TipoCarro.MICRO;
import static Enums.TipoCarro.PICKUP;
import static Enums.TipoCarro.ROADSTER;
import static Enums.TipoCarro.SEDAN;
import static Enums.TipoCarro.SUV;
import static Enums.TipoCarro.TRUCK;
import static Enums.TipoCarro.VAN;

public class Carro extends Veiculo {

    private TipoCarro tipoCarro;
    private ArrayList<Modificacao> kitCorrida;

    public Carro(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro) {
        super(marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoCarro = tipoCarro;
    }

    // ---------- CARROS ----------

    Carro car1 = new Carro("Alpha Romeo", "SportsWagon 156", 200, 150,100,1800, STATION_WAGON);
    Carro car2 = new Carro("Toyota", "Corolla", 140, 142,100,1400, RALLY);
    Carro car3 = new Carro("Volkwagen", "Golf", 150, 134,100,1500, GT);
    Carro car4 = new Carro("BMW", "M3", 190, 168,100,1750, SUV);
    Carro car5 = new Carro("Mercedes", "Classe A", 200, 175,100,1800, PICKUP);
    Carro car6 = new Carro("Ford", "Focus", 150, 174,100,1500, VAN);
    Carro car7 = new Carro("Renault", "Clio", 90, 110,100,1000, ROADSTER);
    Carro car8 = new Carro("Peugeot", "208", 100, 116,100,1100, CONVERTIBLE);
    Carro car9 = new Carro("Honda", "Civic", 184, 151,100,1650, MICRO);
    Carro car10 = new Carro("Hyundai", "Kona", 150, 150,100,1000, SEDAN);
    Carro car11 = new Carro("Tesla", "Model 3", 183, 170,100,1650, GT);
    Carro car12 = new Carro("Audi", "A3", 150, 135,100,1500, TRUCK);
    Carro car13 = new Carro("Porsche", "Cayenne", 195, 150,100,1750, SUV);
    Carro car14 = new Carro("Fiat", "Panda", 175, 118,100,1600, F1);

}