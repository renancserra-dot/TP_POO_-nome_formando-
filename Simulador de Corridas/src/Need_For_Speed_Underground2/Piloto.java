package Need_For_Speed_Underground2;

import Veiculos.Veiculo;

public class Piloto {

    protected String nome;
    protected int fichasCorrida;
    protected veiculoAtual (Veiculo);
    protected int vitorias;

    public Piloto(String nome, int vitorias, int fichasCorrida) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.fichasCorrida = fichasCorrida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFichasCorrida() {
        return fichasCorrida;
    }

    public void setFichasCorrida(int fichasCorrida) {
        this.fichasCorrida = fichasCorrida;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void userItem() {
        //todo
        //que imprime o inventário de itens do VeiculoAtual e pergunta qual quer usar,
        //seguidamente aplica os efeitos no Veiculo do Piloto.
    }

    public void corrida() {
        //todo
        //que recebe como parâmetro uma pista e retorna o tempo total que o
        //piloto demorou a percorrer a pista no seu Veiculo, de acordo com as seguintes regras:
        //o Calcula o tempo de cada volta de acordo com a seguinte fórmula:
        // distanciaVolta/((1.6*potencia))-(0.2*peso)-(0.5*desgaste))
        // A este tempo, somar o tempo que os Momentos atrasaram. Sendo que a cada volta, todos os
        //momentos são repetidos de novo. Para calcular o atraso usar:
        //((peso*atrasoPeso)+(potencia*atrasoPotencia))/100
        //A cada volta, o desgaste do veículo aumenta em 20.
    }
}
