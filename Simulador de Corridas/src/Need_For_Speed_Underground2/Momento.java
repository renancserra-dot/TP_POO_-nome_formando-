package Need_For_Speed_Underground2;

public class Momento {

    protected String nome;
    protected double atrasoPeso;
    protected double atrasoPotencia;

    public Momento(String nome, double atrasoPeso, double atrasoPotencia) {
        this.nome = nome;
        this.atrasoPeso = atrasoPeso;
        this.atrasoPotencia = atrasoPotencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAtrasoPeso() {
        return atrasoPeso;
    }

    public void setAtrasoPeso(double atrasoPeso) {
        this.atrasoPeso = atrasoPeso;
    }

    public double getAtrasoPotencia() {
        return atrasoPotencia;
    }

    public void setAtrasoPotencia(double atrasoPotencia) {
        this.atrasoPotencia = atrasoPotencia;
    }

    public void mostrarDetalhes() {
        System.out.println("Momento: " + this.nome
                + " | Atraso por peso: " + this.atrasoPeso
                + " | Atraso por potência: " + this.atrasoPotencia);
    }
}
