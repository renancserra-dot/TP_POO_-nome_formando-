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


}