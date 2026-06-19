package Main_Stage;

import Enums.TipoMoto;
import Need_For_Speed_Underground2.Piloto;
import PimpMyRide.Habilidade;
import PimpMyRide.ItemCorrida;
import PimpMyRide.Modificacao;
import PimpMyRide.Oficina;
import Veiculos.Carro;
import Veiculos.Mota;

import static Enums.TipoCarro.*;
import static Enums.TipoMoto.*;

public class Main {
    public static void main(String[] args) {

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

        // ---------- HABILIDADE ----------

        Habilidade skill1 = new Habilidade("Tyre Management", 15, 50);
        Habilidade skill2 = new Habilidade("Racing Line", 15, 50);
        Habilidade skill3 = new Habilidade("Trail Braking", 15, 50);
        Habilidade skill4 = new Habilidade("Drafting", 15, 50);
        Habilidade skill5 = new Habilidade("Heel-and-Toe", 15, 50);
        Habilidade skill6 = new Habilidade("Countersteering", 15, 50);
        Habilidade skill7 = new Habilidade("Body Steering", 15, 50);
        Habilidade skill8 = new Habilidade("Sliding", 15, 50);
        Habilidade skill9 = new Habilidade("Anti-Wheelie", 15, 50);
        Habilidade skill10 = new Habilidade("Eagle-eye", 15, 50);

        // ---------- MODIFICAÇÃO ----------

        Modificacao upgrade1 = new Modificacao("Pneus Slick", 15, "New", 15, 20, 20);
        Modificacao upgrade2 = new Modificacao("Coilovers", 15, "New", 15, 20, 20);
        Modificacao upgrade3 = new Modificacao("Kit de Travagem", 15, "New", 15, 20, 20);
        Modificacao upgrade4 = new Modificacao("ECU", 15, "New", 15, 20, 20);
        Modificacao upgrade5 = new Modificacao("Deslizamento Limitado", 15, "New", 15, 20, 20);
        Modificacao upgrade6 = new Modificacao("Quickshifter", 15, "New", 15, 20, 20);
        Modificacao upgrade7 = new Modificacao("Fibra de Carbono", 15, "New", 15, 20, 20);
        Modificacao upgrade8 = new Modificacao("Amortecedor", 15, "New", 15, 20, 20);
        Modificacao upgrade9 = new Modificacao("Aileron", 15, "New", 15, 20, 20);
        Modificacao upgrade10 = new Modificacao("Neon", 15, "New", 15, 20, 20);

        // ---------- OFICINA: PIMP MY RIDE ----------

        Oficina workshop = new Oficina(); // Criar a Oficina

        // Adicionar Habilidades na Oficina
        workshop.adicionarItem(skill1);
        workshop.adicionarItem(skill2);
        workshop.adicionarItem(skill3);
        workshop.adicionarItem(skill4);
        workshop.adicionarItem(skill5);
        workshop.adicionarItem(skill6);
        workshop.adicionarItem(skill7);
        workshop.adicionarItem(skill8);
        workshop.adicionarItem(skill9);
        workshop.adicionarItem(skill10);

        // Adicionar Modificações na Oficina
        workshop.adicionarItem(upgrade1);
        workshop.adicionarItem(upgrade2);
        workshop.adicionarItem(upgrade3);
        workshop.adicionarItem(upgrade4);
        workshop.adicionarItem(upgrade5);
        workshop.adicionarItem(upgrade6);
        workshop.adicionarItem(upgrade7);
        workshop.adicionarItem(upgrade8);
        workshop.adicionarItem(upgrade9);
        workshop.adicionarItem(upgrade10);









        Piloto p1 = new Piloto("Batman", 20000, car1, 0);

        car1.exibirDetalhes();

        workshop.venderItem(p1);
    }
}
