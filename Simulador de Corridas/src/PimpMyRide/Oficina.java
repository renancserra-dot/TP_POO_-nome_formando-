package PimpMyRide;

import Need_For_Speed_Underground2.Piloto;
import Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Oficina {
    private ArrayList<Veiculo> garagem;
    private ArrayList<ItemCorrida> stock;

    public Oficina() {
        this.garagem = new ArrayList<Veiculo>();
        this.stock = new ArrayList<ItemCorrida>();

        // ---------- MODIFICAÇÃO ----------
        Modificacao upgrade1 = new Modificacao("Pneus Slick", 15, 20, 20);
        Modificacao upgrade2 = new Modificacao("Coilovers", 15, 20, 20);
        Modificacao upgrade3 = new Modificacao("Kit de Travagem", 15, 20, 20);
        Modificacao upgrade4 = new Modificacao("ECU", 15, 20, 20);
        Modificacao upgrade5 = new Modificacao("Deslizamento Limitado", 15, 20, 20);
        Modificacao upgrade6 = new Modificacao("Quickshifter", 15, 20, 20);
        Modificacao upgrade7 = new Modificacao("Fibra de Carbono", 15, 20, 20);
        Modificacao upgrade8 = new Modificacao("Amortecedor", 15, 20, 20);
        Modificacao upgrade9 = new Modificacao("Aileron", 15, 20, 20);
        Modificacao upgrade10 = new Modificacao("Neon", 15, 20, 20);

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

        // Adicionar Habilidades na Oficina
        this.adicionarItem(skill1);
        this.adicionarItem(skill2);
        this.adicionarItem(skill3);
        this.adicionarItem(skill4);
        this.adicionarItem(skill5);
        this.adicionarItem(skill6);
        this.adicionarItem(skill7);
        this.adicionarItem(skill8);
        this.adicionarItem(skill9);
        this.adicionarItem(skill10);

        // Adicionar Modificações na Oficina
        this.adicionarItem(upgrade1);
        this.adicionarItem(upgrade2);
        this.adicionarItem(upgrade3);
        this.adicionarItem(upgrade4);
        this.adicionarItem(upgrade5);
        this.adicionarItem(upgrade6);
        this.adicionarItem(upgrade7);
        this.adicionarItem(upgrade8);
        this.adicionarItem(upgrade9);
        this.adicionarItem(upgrade10);
    }

    public ArrayList<Veiculo> getGaragem() {
        return garagem;
    }

    public ArrayList<ItemCorrida> getStock() {
        return stock;
    }

    public void adicionarItem(ItemCorrida itemNovo) {
        this.stock.add(itemNovo);
    }


    public void adicionarVeiculo(Veiculo veiculoNovo) {
        this.garagem.add(veiculoNovo);
    }


    public void imprimirStock() {
        Collections.shuffle(stock);
        int limite = Math.min(stock.size(), 6);

        for (int i = 0; i < limite; i++) {
            System.out.println("[" + i + "] ");
            stock.get(i).mostrarDetalhes();
        }
    }

    public void imprimirGaragem() {
        Collections.shuffle(garagem);
        int limite = Math.min(garagem.size(), 12);

        for (int i = 0; i < limite; i++) {
            System.out.println("[" + i + "] ");
            garagem.get(i).mostrarDetalhes();
        }
    }


    public void venderItem(Piloto itemVendido) {
        Scanner input = new Scanner(System.in);

        System.out.println("----- Item para Venda -----");
        imprimirStock();

        System.out.println("Escolha o número do item que deseja comprar:");
        int escolhaUtilizador = input.nextInt();
        int limiteMostrado = Math.min(this.stock.size(), 6);

        if (escolhaUtilizador >= 0 && escolhaUtilizador < limiteMostrado) {

            ItemCorrida item = this.stock.get(escolhaUtilizador);


            if (itemVendido.getFichasCorrida() >= item.getPrecoFichasCorrida()) {

                itemVendido.getVeiculoAtual().adicionarItem(item);

                int saldoAtual = itemVendido.getFichasCorrida();
                itemVendido.setFichasCorrida(saldoAtual - item.getPrecoFichasCorrida());

                this.stock.remove(escolhaUtilizador);

                System.out.println("Venda do Item: " + item.getNome());
            } else {
                System.out.println("Não tem saldo suficiente para a compra");
            }
        } else {
            System.out.println("Escolha inválida");
        }
    }

    public void venderVeiculo(Piloto veiculoVendido) {
        Scanner input = new Scanner(System.in);

        System.out.println("----- Veiculo para Venda -----");
        this.imprimirGaragem();

        System.out.println("Escolha o número do veículo que deseja comprar:");
        int escolhaUtilizador = input.nextInt();

        int limiteMostrado = Math.min(this.garagem.size(), 12);

        if (escolhaUtilizador >= 0 && escolhaUtilizador < limiteMostrado) {

            Veiculo item = this.garagem.get(escolhaUtilizador);

            if (veiculoVendido.getFichasCorrida() >= item.getPreco()) {

                veiculoVendido.setVeiculoAtual(item);

                int saldoAtual = veiculoVendido.getFichasCorrida();
                veiculoVendido.setFichasCorrida(saldoAtual - item.getPreco());

                this.garagem.remove(escolhaUtilizador);

                System.out.println("Venda do veículo: " + item.getMarca() + " | " + item.getModelo());
            } else {
                System.out.println("Não tem saldo suficiente para a compra");
            }
        } else {
            System.out.println("Escolha inválida");
        }
    }
}