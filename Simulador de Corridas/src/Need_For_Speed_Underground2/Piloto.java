package Need_For_Speed_Underground2;

import PimpMyRide.Habilidade;
import PimpMyRide.ItemCorrida;
import PimpMyRide.Modificacao;
import Veiculos.Veiculo;

import java.util.Scanner;


public class Piloto {

    protected String nome;
    protected int fichasCorrida;
    protected Veiculo veiculoAtual;
    protected int vitorias;

    public Piloto(String nome, int fichasCorrida, Veiculo veiculoAtual, int vitorias) {
        this.nome = nome;
        this.fichasCorrida = fichasCorrida;
        this.veiculoAtual = veiculoAtual;
        this.vitorias = vitorias;
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

    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(Veiculo veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    /**
     * Imprime o inventário de itens do veículo atual e pergunta ao utilizador
     * qual quer usar. Depois aplica o efeito desse item no veículo.
     */
    public void usarItem() {

        // 0. Se o inventário estiver vazio, não há nada para usar
        if (this.veiculoAtual.getInventarioItem().isEmpty()) {
            System.out.println("O inventário está vazio. Não há itens para usar.");
            return;
        }

        // 1. Imprimir o inventário
        System.out.println("----- Inventário -----");
        for (int i = 0; i < this.veiculoAtual.getInventarioItem().size(); i++) {
            ItemCorrida item = this.veiculoAtual.getInventarioItem().get(i);
            System.out.println((i + 1) + " - " + item.getNome());
        }

        // 2. Perguntar ao utilizador qual quer usar
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um item (0 para sair):");
        int escolha = input.nextInt();

        if (escolha == 0) {
            return; // utilizador escolheu sair
        }

        int indice = escolha - 1;

        // Validação: a escolha tem de corresponder a um item que existe na lista
        if (indice < 0 || indice >= this.veiculoAtual.getInventarioItem().size()) {
            System.out.println("Escolha inválida.");
            return;
        }

        ItemCorrida itemEscolhido = this.veiculoAtual.getInventarioItem().get(indice);

        // 3. Aplicar o efeito do item no veículo
        aplicarEfeitoItem(itemEscolhido);

        // 4. O item foi usado, por isso é removido do inventário
        this.veiculoAtual.getInventarioItem().remove(indice);
    }

    /**
     * Aplica o efeito de um item no veículo atual.
     * Se for uma Modificação, reduz peso e desgaste.
     * Se for uma Habilidade, aumenta a potência.
     */
    private void aplicarEfeitoItem(ItemCorrida item) {

        if (item instanceof Modificacao) {
            Modificacao mod = (Modificacao) item;
            this.veiculoAtual.setPesoKg(this.veiculoAtual.getPesoKg() - mod.getDiminuicaoPeso());
            this.veiculoAtual.setDesgaste(this.veiculoAtual.getDesgaste() - mod.getDiminuicaoDesgaste());
        }

        if (item instanceof Habilidade) {
            Habilidade hab = (Habilidade) item;
            this.veiculoAtual.setPotenciaCV(this.veiculoAtual.getPotenciaCV() + hab.getAumentoPotencia());
        }
    }

    /**
     * Calcula o tempo total que o piloto demora a percorrer a pista
     * - tempo da volta = distanciaVolta / (1.6*potencia - 0.2*peso - 0.5*desgaste)
     * - a esse tempo soma-se o atraso de cada momento da pista (repetidos todas as voltas)
     * - atraso de um momento = (peso*atrasoPeso + potencia*atrasoPotencia) / 100
     * - a cada volta, o desgaste do veículo aumenta 20
     */
    public double corrida(Pista pistaAtual) {

        double tempoTotal = 0;
        double potencia = this.veiculoAtual.getPotenciaCV();
        double peso = this.veiculoAtual.getPesoKg();

        for (int volta = 1; volta <= pistaAtual.getQuantidadeVoltas(); volta++) {

            double desgaste = this.veiculoAtual.getDesgaste();

            // Tempo base da volta
            double tempoVolta = pistaAtual.getDistanciaVoltaM() / ((1.6 * potencia) - (0.2 * peso) - (0.5 * desgaste));

            // Somar o atraso de cada momento da pista
            for (Momento momento : pistaAtual.getMomentosPista()) {
                double atraso = ((peso * momento.getAtrasoPeso()) + (potencia * momento.getAtrasoPotencia())) / 100;
                tempoVolta = tempoVolta + atraso;
            }

            tempoTotal = tempoTotal + tempoVolta;

            // A cada volta o desgaste aumenta 20
            this.veiculoAtual.aumentarDesgaste(20);
        }

        return tempoTotal;
    }
}