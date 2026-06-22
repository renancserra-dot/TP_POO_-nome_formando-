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
        this.garagem=new ArrayList<Veiculo>();
        this.stock=new ArrayList<ItemCorrida>();


        // ---------- MODIFICAÇÃO ----------
        Modificacao upgrade1 = new Modificacao("Pneus Slick", 15,  15, 20, 20);
        Modificacao upgrade2 = new Modificacao("Coilovers", 15,  15, 20, 20);
        Modificacao upgrade3 = new Modificacao("Kit de Travagem", 15,  15, 20, 20);
        Modificacao upgrade4 = new Modificacao("ECU", 15,  15, 20, 20);
        Modificacao upgrade5 = new Modificacao("Deslizamento Limitado", 15,  15, 20, 20);
        Modificacao upgrade6 = new Modificacao("Quickshifter", 15,  15, 20, 20);
        Modificacao upgrade7 = new Modificacao("Fibra de Carbono", 15,  15, 20, 20);
        Modificacao upgrade8 = new Modificacao("Amortecedor", 15,  15, 20, 20);
        Modificacao upgrade9 = new Modificacao("Aileron", 15, 15, 20, 20);
        Modificacao upgrade10 = new Modificacao("Neon", 15, 15, 20, 20);



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

    public void adicionarItem(ItemCorrida itemNovo){
        this.stock.add(itemNovo);
    }

    public void adicionarVeiculo(Veiculo veiculoNovo){
        this.garagem.add(veiculoNovo);
    }

    public void imprimirStock() {

      Collections.shuffle(stock);

      int limite = Math.min(stock.size(), 6);

        for (int i = 0; i < limite; i++) {
            stock.get(i).exibirDetalhes();
        }
    }

    public void imprimirGaragem() {

        Collections.shuffle(garagem);

        for (int i = 0; i < 12; i++) {
            System.out.println(garagem.get(i));
        }
    }

    public void venderItem(Piloto itemVendido) {

        Scanner input = new Scanner(System.in);

        System.out.println("----- Item para Venda -----");
        imprimirStock(); // invocar a funçao para mostrar o stock disponivel

        int escolhaUtilizador = input.nextInt(); // escolha do utilizador no Scanner

       if (escolhaUtilizador < this.stock.size()) { // compara ao stock disponivel

            ItemCorrida item = this.stock.get(escolhaUtilizador); // obter o item do stock

           // Verificas as fichas do Piloto: se pode comprar
            if (itemVendido.getFichasCorrida() >= item.getPrecoFichasCorrida()) {

                // Adiciona ao Veiculo Atual do Piloto o item comprado
                // Chama o metodo de adicionarItem() criado na classe Veiculo
                itemVendido.getVeiculoAtual().adicionarItem(item);

                // Utilizo o set para mudar as fichas de corrida e decrementar o valor gasto
                int saldoAtual = itemVendido.getFichasCorrida();
                itemVendido.setFichasCorrida(saldoAtual - item.getPrecoFichasCorrida());

                this.stock.remove(escolhaUtilizador); // Remove do stock a escolha do Piloto

                System.out.println("Venda do Item: " + item.getNome());
            } else {
                System.out.println("Não tem saldo suficiente para a compra");
            }
       } else { // Se a escolha não existir no Stock
           System.out.println("Escolha inválida");
       }
    }

    public void venderVeiculo(Piloto veiculoVendido) {

        Scanner input = new Scanner(System.in);

        System.out.println("----- Veiculo para Venda -----");
        this.imprimirGaragem(); // invocar o metodo para mostrar a garagem com os veiculos diponiveis

        int escolhaUtilizador = input.nextInt(); // escolha do utilizador no Scanner

        if (escolhaUtilizador < this.garagem.size()) { // compara na garagem se esta disponivel

            Veiculo item = this.garagem.get(escolhaUtilizador); // obter o item da garagem

            // Verificas as fichas do Piloto: se pode comprar
            // preço do Veiculo
            if (veiculoVendido.getFichasCorrida() >= item.getPreco()) {

                // Uso o 'set' para mudar o veiculo do piloto
                veiculoVendido.setVeiculoAtual(item);

                // Verificar as fichas do utilizador
                int saldoAtual = veiculoVendido.getFichasCorrida();
                veiculoVendido.setFichasCorrida(saldoAtual - item.getPreco());

                this.garagem.remove(escolhaUtilizador);

                System.out.println("Venda do veiculo: " + item.getMarca());
            } else {
                System.out.println("Não tem saldo suficiente para a compra");
            }
        } else {
            System.out.println("Escolha inválida");
        }
    }
}
