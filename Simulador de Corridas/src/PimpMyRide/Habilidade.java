package PimpMyRide;

public class Habilidade extends ItemCorrida {

    private int aumentoPotencia;

    public Habilidade(String nome, int precoFichasCorrida, int aumentoPotencia) {
        super(nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }

    public int getAumentoPotencia() {
        return aumentoPotencia;
    }

    public void setAumentoPotencia(int aumentoPotencia) {
        this.aumentoPotencia = aumentoPotencia;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("----- Detalhes de Habilidade -----");
        System.out.println("Nome: " + this.getNome()
                + " | Preço em fichas de corrida: " + this.getPrecoFichasCorrida()
                + " | Aumento de potência: " + this.aumentoPotencia);
    }
}
