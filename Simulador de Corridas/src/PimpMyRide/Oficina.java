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
    }

    public void adicionarItem(ItemCorrida itemNovo){
        this.stock.add(itemNovo);
    }

    public void adicionarVeiculo(Veiculo veiculoNovo){
        this.garagem.add(veiculoNovo);
    }

    public void imprimirStock() {

      Collections.shuffle(stock);

        for (ItemCorrida itemAtual : stock) {
            int count = 0;
            if (count < 6) {
                count++;
                System.out.println(itemAtual.getNome());
            }
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
