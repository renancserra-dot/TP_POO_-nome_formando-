package Need_For_Speed_Underground2;

import Enums.TipoCarro;
import Enums.TipoMoto;
import PimpMyRide.Oficina;
import Veiculos.Carro;
import Veiculos.Mota;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe principal do jogo. Junta o Piloto, as Pistas, a Oficina e todos
 * os veículos/itens, e contém o ciclo de jogo (simuladorCorridas).
 */
public class Jogo {

    // Pistas do campeonato
    private ArrayList<Pista> pistas;

    // ---------- CARROS ----------
    // (reaproveitados da versão original da Classe Jogo)
    private Carro car1 = new Carro("Alpha Romeo", "SportsWagon 156", 200, 150, 100, 1800, TipoCarro.STATION_WAGON);
    private Carro car2 = new Carro("Toyota", "Corolla", 140, 142, 100, 1400, TipoCarro.RALLY);
    private Carro car3 = new Carro("Volkswagen", "Golf", 150, 134, 100, 1500, TipoCarro.GT);
    private Carro car4 = new Carro("BMW", "M3", 190, 168, 100, 1750, TipoCarro.SUV);
    private Carro car5 = new Carro("Mercedes", "Classe A", 200, 175, 100, 1800, TipoCarro.PICKUP);
    private Carro car6 = new Carro("Ford", "Focus", 150, 174, 100, 1500, TipoCarro.VAN);
    private Carro car7 = new Carro("Renault", "Clio", 90, 110, 100, 1000, TipoCarro.ROADSTER);
    private Carro car8 = new Carro("Peugeot", "208", 100, 116, 100, 1100, TipoCarro.CONVERTIBLE);
    private Carro car9 = new Carro("Honda", "Civic", 184, 151, 100, 1650, TipoCarro.MICRO);
    private Carro car10 = new Carro("Hyundai", "Kona", 150, 150, 100, 1000, TipoCarro.SEDAN);
    private Carro car11 = new Carro("Tesla", "Model 3", 183, 170, 100, 1650, TipoCarro.GT);
    private Carro car12 = new Carro("Audi", "A3", 150, 135, 100, 1500, TipoCarro.TRUCK);
    private Carro car13 = new Carro("Porsche", "Cayenne", 195, 150, 100, 1750, TipoCarro.SUV);
    private Carro car14 = new Carro("Fiat", "Panda", 175, 118, 100, 1600, TipoCarro.F1);

    // ---------- MOTAS ----------
    // (reaproveitadas da versão original da Classe Jogo)
    private Mota mota1 = new Mota("Honda", "PCX", 75, 30, 50, 1000, TipoMoto.CRUISER);
    private Mota mota2 = new Mota("Yamaha", "MT-07", 73, 30, 50, 1000, TipoMoto.MOTOCROSS);
    private Mota mota3 = new Mota("BMW", "R 1250 GS", 96, 30, 50, 1000, TipoMoto.SPORT_BIKE);
    private Mota mota4 = new Mota("Kawasaki", "Z900", 95, 30, 50, 1000, TipoMoto.SCOOTER);
    private Mota mota5 = new Mota("Ducati", "Monster", 88, 30, 50, 1000, TipoMoto.STANDARD);
    private Mota mota6 = new Mota("KTM", "390 Duke", 65, 30, 50, 1000, TipoMoto.CHOPPER);
    private Mota mota7 = new Mota("Triumph", "Bonneville", 80, 30, 50, 1000, TipoMoto.ATV);
    private Mota mota8 = new Mota("Suzuki", "Hayabusa", 90, 30, 50, 1000, TipoMoto.CRUISER);
    private Mota mota9 = new Mota("Harley-Davidson", "Iron 883", 78, 30, 50, 1000, TipoMoto.CHOPPER);
    private Mota mota10 = new Mota("Aprilia", "RS 660", 100, 30, 50, 1000, TipoMoto.MOTOCROSS);
    private Mota mota11 = new Mota("Vespa", "GTS 300", 55, 30, 50, 1000, TipoMoto.SPORT_BIKE);
    private Mota mota12 = new Mota("Benelli", "TRK 502", 65, 30, 50, 1000, TipoMoto.SCOOTER);
    private Mota mota13 = new Mota("Royal Enfield", "Meteor 350", 72, 30, 50, 1000, TipoMoto.ATV);
    private Mota mota14 = new Mota("Keeway", "Superlight 125", 62, 30, 50, 1000, TipoMoto.STANDARD);

    // ---------- MOMENTOS ----------
    // (reaproveitados da versão original da Classe Momento)
    private Momento momento1 = new Momento("Curva em S", 15.5, 30);
    private Momento momento2 = new Momento("Curva em U", 20, 20);
    private Momento momento3 = new Momento("Subida montanhosa", 17.5, 18);
    private Momento momento4 = new Momento("Inversão de Marcha", 22.5, 28);
    private Momento momento5 = new Momento("Peão na pista", 10, 5);
    private Momento momento6 = new Momento("Piso húmido", 18.5, 22);
    private Momento momento7 = new Momento("Espaço reduzido", 20, 30);

    public Jogo() {
        this.pistas = new ArrayList<>();
    }

    public ArrayList<Pista> getPistas() {
        return pistas;
    }

    /**
     * Cria um piloto na consola.
     * Pergunta o nome e a dificuldade, e atribui as fichas de corrida iniciais
     * de acordo com a dificuldade escolhida.
     *
     * @return o piloto criado (ainda sem veículo - será obrigado a comprar um na oficina inicial)
     */
    public Piloto criarPiloto() {

        Scanner input = new Scanner(System.in);

        System.out.println("===== CRIAÇÃO DE PILOTO =====");
        System.out.println("Qual é o nome do piloto?");
        String nome = input.nextLine();

        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil  (2000 fichas de corrida)");
        System.out.println("2 - Difícil (1500 fichas de corrida)");
        int dificuldade = input.nextInt();

        int fichasIniciais;

        switch (dificuldade) {
            case 1:
                fichasIniciais = 2000;
                break;
            case 2:
                fichasIniciais = 1500;
                break;
            default:
                System.out.println("Opção inválida, foi definida a dificuldade Fácil por defeito.");
                fichasIniciais = 2000;
                break;
        }

        // O piloto começa sem veículo (null); a oficina inicial vai obrigá-lo a comprar um.
        Piloto piloto = new Piloto(nome, fichasIniciais, null, 0);

        System.out.println("Piloto " + nome + " criado com " + fichasIniciais + " fichas de corrida!");

        return piloto;
    }

    /**
     * Método principal do jogo. Recebe o piloto já criado e conduz todo o
     * campeonato: cria as pistas, obriga à compra do primeiro veículo,
     * percorre todas as pistas (a última sendo o desafio final obrigatório),
     * e em cada corrida processa a recompensa, o uso de itens e a oficina
     * pós-corrida.
     *
     * @param piloto piloto criado em criarPiloto()
     */
    public void simuladorCorridas(Piloto piloto) {

        // 1. Criar as pistas do campeonato
        criarPistas();

        // 2. Oficina inicial - o piloto é obrigado a comprar o primeiro veículo
        Oficina oficinaInicial = criarOficinaInicial();
        obrigarCompraVeiculoInicial(piloto, oficinaInicial);

        // 3. Percorrer todas as pistas do campeonato, uma a uma
        for (int i = 0; i < this.pistas.size(); i++) {

            Pista pistaAtual = this.pistas.get(i);

            // A última pista da lista é a pista derradeira do campeonato.
            boolean ultimaPista = (i == this.pistas.size() - 1);

            if (ultimaPista) {
                System.out.println("===== PISTA FINAL: " + pistaAtual.getNome() + " =====");
                System.out.println("Esta é a derradeira pista! Tem de bater o recorde para se tornar um piloto lendário.");
            } else {
                System.out.println("===== PISTA " + (i + 1) + ": " + pistaAtual.getNome() + " =====");
            }

            pistaAtual.mostrarDetalhes();

            // Antes de cada corrida, o veículo é preparado: o desgaste é reposto a 0
            // (equivale a uma revisão/manutenção feita antes da corrida começar).
            // Isto evita que o desgaste acumulado de pistas anteriores.
            piloto.getVeiculoAtual().setDesgaste(0);

            // Correr a pista no veículo atual do piloto
            double tempoObtido = piloto.corrida(pistaAtual);
            System.out.println("Tempo obtido: " + tempoObtido + " segundos.");

            if (ultimaPista) {
                // Na pista final, bater o recorde é obrigatório para vencer o jogo.
                if (tempoObtido <= pistaAtual.getTempoRecordeSeg()) {
                    piloto.setVitorias(piloto.getVitorias() + 1);
                    System.out.println("PARABÉNS " + piloto.getNome() + "! Tornou-se um piloto lendário!");
                } else {
                    System.out.println("Não conseguiu bater o recorde da pista final. Tente novamente!");
                }
                break; // o campeonato termina aqui, ganhando ou não
            }

            // Pistas normais: dar recompensa, abrir oficina (onde pode comprar itens),
            // e só depois permitir usar itens
            processarRecompensa(piloto, pistaAtual, tempoObtido);
            abrirOficinaPosCorrida(piloto);
            usarItensPosCorrida(piloto);
        }

        System.out.println("===== FIM DO CAMPEONATO =====");
        System.out.println("Piloto: " + piloto.getNome() + " | Vitórias: " + piloto.getVitorias() + " | Fichas finais: " + piloto.getFichasCorrida());
    }

    /**
     * Cria as pistas do campeonato e os respetivos momentos e guarda-as no atributo "pistas".
     * <p>
     * São criadas 7 pistas, cada uma com 2 momentos diferentes
     * exceto a última ("The Grid"), que é a pista derradeira do campeonato.
     */
    private void criarPistas() {

        Pista pista1 = new Pista("Tokyo Drift", 200, 100, 800, 2);
        Pista pista2 = new Pista("Highway to Hell", 200, 130, 1200, 2);
        Pista pista3 = new Pista("Circuit de Monaco", 200, 220, 1500, 3);
        Pista pista4 = new Pista("The Death Course", 200, 260, 2000, 3);
        Pista pista5 = new Pista("The Wheel of Power", 200, 230, 2500, 4);
        Pista pista6 = new Pista("Casa Cristo", 200, 320, 3000, 4);
        // Pista derradeira do campeonato.
        Pista pista7 = new Pista("The Grid", 200, 900, 5000, 5);

        // Associar 2 momentos diferentes a cada uma das primeiras 6 pistas.
        pista1.adicionarMomento(momento1);
        pista1.adicionarMomento(momento5);

        pista2.adicionarMomento(momento2);
        pista2.adicionarMomento(momento6);

        pista3.adicionarMomento(momento3);
        pista3.adicionarMomento(momento7);

        pista4.adicionarMomento(momento4);
        pista4.adicionarMomento(momento1);

        pista5.adicionarMomento(momento5);
        pista5.adicionarMomento(momento2);

        pista6.adicionarMomento(momento6);
        pista6.adicionarMomento(momento3);

        // A pista derradeira tem 4 momentos.
        pista7.adicionarMomento(momento1);
        pista7.adicionarMomento(momento4);
        pista7.adicionarMomento(momento6);
        pista7.adicionarMomento(momento7);

        this.pistas.add(pista1);
        this.pistas.add(pista2);
        this.pistas.add(pista3);
        this.pistas.add(pista4);
        this.pistas.add(pista5);
        this.pistas.add(pista6);
        this.pistas.add(pista7);
    }

    /**
     * Cria a oficina inicial do campeonato, com os veículos disponíveis para compra.
     * A oficina já vem com 10 modificações e 10 habilidades em stock (criadas no
     * construtor da própria Oficina).
     *
     * @return a oficina inicial, com 28 veículos na garagem
     */
    private Oficina criarOficinaInicial() {

        Oficina oficinaInicial = new Oficina();

        // Carros
        oficinaInicial.adicionarVeiculo(car1);
        oficinaInicial.adicionarVeiculo(car2);
        oficinaInicial.adicionarVeiculo(car3);
        oficinaInicial.adicionarVeiculo(car4);
        oficinaInicial.adicionarVeiculo(car5);
        oficinaInicial.adicionarVeiculo(car6);
        oficinaInicial.adicionarVeiculo(car7);
        oficinaInicial.adicionarVeiculo(car8);
        oficinaInicial.adicionarVeiculo(car9);
        oficinaInicial.adicionarVeiculo(car10);
        oficinaInicial.adicionarVeiculo(car11);
        oficinaInicial.adicionarVeiculo(car12);
        oficinaInicial.adicionarVeiculo(car13);
        oficinaInicial.adicionarVeiculo(car14);

        // Motas
        oficinaInicial.adicionarVeiculo(mota1);
        oficinaInicial.adicionarVeiculo(mota2);
        oficinaInicial.adicionarVeiculo(mota3);
        oficinaInicial.adicionarVeiculo(mota4);
        oficinaInicial.adicionarVeiculo(mota5);
        oficinaInicial.adicionarVeiculo(mota6);
        oficinaInicial.adicionarVeiculo(mota7);
        oficinaInicial.adicionarVeiculo(mota8);
        oficinaInicial.adicionarVeiculo(mota9);
        oficinaInicial.adicionarVeiculo(mota10);
        oficinaInicial.adicionarVeiculo(mota11);
        oficinaInicial.adicionarVeiculo(mota12);
        oficinaInicial.adicionarVeiculo(mota13);
        oficinaInicial.adicionarVeiculo(mota14);

        return oficinaInicial;
    }

    /**
     * Obriga o piloto a comprar um veículo na oficina inicial, antes de
     * poder começar o campeonato. Repete a pergunta até a compra ser feita
     * com sucesso.
     *
     * @param piloto  piloto que ainda não tem veículo
     * @param oficina oficina inicial, com os veículos disponíveis para compra
     */
    private void obrigarCompraVeiculoInicial(Piloto piloto, Oficina oficina) {

        System.out.println("===== OFICINA INICIAL =====");
        System.out.println("Antes de começar o campeonato, tem de comprar o seu primeiro veículo!");

        while (piloto.getVeiculoAtual() == null) {
            oficina.venderVeiculo(piloto);
        }

        System.out.println("Veículo escolhido: " + piloto.getVeiculoAtual().getMarca() + " " + piloto.getVeiculoAtual().getModelo());
    }

    /**
     * Compara o tempo obtido pelo piloto com o recorde da pista, e atribui
     * fichas de corrida: fichas completas se bateu o recorde,
     * ou metade se não bateu.
     *
     * @param piloto      piloto a recompensar
     * @param pistaAtual  pista que foi percorrida
     * @param tempoObtido tempo que o piloto fez na pista
     */
    private void processarRecompensa(Piloto piloto, Pista pistaAtual, double tempoObtido) {

        Random sorteio = new Random();
        int fichasBase = sorteio.nextInt(500) + 500;

        if (tempoObtido <= pistaAtual.getTempoRecordeSeg()) {
            System.out.println("Novo recorde na pista " + pistaAtual.getNome() + "!");
            piloto.setFichasCorrida(piloto.getFichasCorrida() + fichasBase);
            System.out.println("Recebeu " + fichasBase + " fichas de corrida.");
        } else {
            int fichasRecebidas = fichasBase / 2;
            System.out.println("Não bateu o recorde da pista " + pistaAtual.getNome() + ".");
            piloto.setFichasCorrida(piloto.getFichasCorrida() + fichasRecebidas);
            System.out.println("Recebeu " + fichasRecebidas + " fichas de corrida.");
        }
    }

    /**
     * Permite ao piloto usar itens de corrida do seu inventário, no final da
     * corrida, com um limite máximo de 2 itens usados.
     *
     * @param piloto piloto que pode usar os itens
     */
    private void usarItensPosCorrida(Piloto piloto) {

        Scanner input = new Scanner(System.in);
        int itensUsados = 0;

        while (itensUsados < 2) {
            System.out.println("Deseja usar um item de corrida? (1-Sim  0-Não)");
            int resposta = input.nextInt();

            if (resposta == 0) {
                break; // o piloto não quer usar mais itens
            }

            piloto.usarItem();
            itensUsados++;
        }
    }

    /**
     * Abre uma nova oficina (itens + veículos) após o fim de uma corrida, e
     * permite ao piloto comprar itens e/ou veículos, de forma opcional.
     *
     * @param piloto piloto que pode comprar
     */
    private void abrirOficinaPosCorrida(Piloto piloto) {

        // Nova instância de Oficina, com novos itens
        Oficina oficinaPosCorrida = criarOficinaInicial();

        Scanner input = new Scanner(System.in);

        System.out.println("===== OFICINA PÓS-CORRIDA =====");
        System.out.println("Saldo atual: " + piloto.getFichasCorrida() + " fichas de corrida.");

        System.out.println("Deseja comprar um item de corrida? (1-Sim  0-Não)");
        if (input.nextInt() == 1) {
            oficinaPosCorrida.venderItem(piloto);
        }

        System.out.println("Deseja comprar um veículo novo? (1-Sim  0-Não)");
        if (input.nextInt() == 1) {
            oficinaPosCorrida.venderVeiculo(piloto);
        }
    }
}