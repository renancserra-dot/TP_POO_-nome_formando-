package PimpMyRide;

import Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.Collections;


public class Oficina {
    private ArrayList<Veiculo> garagem;
    private ArrayList<ItemCorrida> stock;


    public void imprimirStock() {

      Collections.shuffle(stock);

        for (int i = 0; i < 6; i++) {
            System.out.println(stock.get(i));
        }
    }


    public void imprimirGaragem() {
        //todo
        //imprime aleatoriamente 12 veiculos em stock, assim como
        //as suas especificações. Mesmo que a oficina tenha uma garagem maior, apenas 12 devem ser mostrados
        //de forma aleatória.
    }

    public void venderItem() {
        //todo
        //que recebe o Piloto como parâmetro, e verifica se a compra pode
        //ser efetuada, caso tal compra seja possível, deve acrescentar ao inventário do VeiculoAtual do Piloto o
        //item, e decrementar as suas fichas de corrida.
    }

    public void venderVeiculo() {
        //todo
        //que recebe o Piloto como parâmetro, e verifica se a compra
        //pode ser efetuada, caso tal compra seja possível, deve alterar o Veiculo do Piloto, e decrementar as suas
        //fichas de corrida.
    }
}
