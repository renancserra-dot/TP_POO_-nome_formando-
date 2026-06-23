package Need_For_Speed_Underground2;

import PimpMyRide.Oficina;
import Veiculos.Carro;
import Veiculos.Mota;
import Veiculos.Veiculo;

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
import static Enums.TipoMoto.*;
import static Enums.TipoMoto.STANDARD;

public class Jogo {



    public void criarPiloto () {
        //todo
        //que permita criar um piloto através de feedback da consola
        //(pode criar métodos auxiliares nas respetivas classes).
        //o A seguir é também atribuído fichas de corrida à personagem, se a dificuldade for fácil tem direito a 2000
        //moedas de ouro, se for difícil apenas a 1500 moedas de ouro. (exemplo demonstrativo, pode alterar os
        //valores e ainda acrescentar outros graus de dificuldade).
    }

    public void quickRace() {
        //todo
    }

    public void practiceRace() {
        //todo
    }

    public void competitionRace() {
        //todo
    }

    public void grandPrix() {
        //todo
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
