package Main_Stage;

import Need_For_Speed_Underground2.Piloto;
import PimpMyRide.Habilidade;
import PimpMyRide.ItemCorrida;
import PimpMyRide.Modificacao;
import PimpMyRide.Oficina;
import Veiculos.Carro;

import static Enums.TipoCarro.*;

public class Main {
    public static void main(String[] args) {

        // ---------- CARROS ----------
        Carro car1 = new Carro("Alpha Romeo", "SportsWagon 156", 200, 150,100,1800, STATION_WAGON);
        Carro car2 = new Carro("Toyota", "Corolla", 140, 142,100,1000, RALLY);
        Carro car3 = new Carro("Volkwagen", "Golf", 150, 134,100,1000, GT);
        Carro car4 = new Carro("BMW", "M3", 190, 168,100,1000, SUV);
        Carro car5 = new Carro("Mercedes", "Classe A", 200, 175,100,1800, PICKUP);
        Carro car6 = new Carro("Ford", "Focus", 150, 174,100,1000, VAN);
        Carro car7 = new Carro("Renault", "Clio", 90, 110,100,1000, ROADSTER);
        Carro car8 = new Carro("Peugeot", "208", 100, 116,100,1000, CONVERTIBLE);
        Carro car9 = new Carro("Honda", "Civic", 184, 151,100,1000, MICRO);
        Carro car10 = new Carro("Hyundai", "Kona", 150, 150,100,1000, SEDAN);
        Carro car11 = new Carro("Tesla", "Model 3", 183, 170,100,1000, GT);
        Carro car12 = new Carro("Audi", "A3", 150, 135,100,1000, TRUCK);
        Carro car13 = new Carro("Porsche", "Cayenne", 195, 150,100,1000, SUV);
        Carro car14 = new Carro("Fiat", "Panda", 175, 118,100,1000, F1);




        Piloto p1 = new Piloto("Batman", 20000, car1, 0);

        Habilidade skill1 = new Habilidade("Nitro", 15, 50);

        Modificacao upgrade = new Modificacao("Neon", 15, "New", 15, 20, 20);


        Oficina workshop = new Oficina();
        workshop.adicionarVeiculo(car1);
        workshop.adicionarItem(skill1);
        workshop.adicionarItem(upgrade);

        car1.exibirDetalhes();

        workshop.venderItem(p1);
    }
}
