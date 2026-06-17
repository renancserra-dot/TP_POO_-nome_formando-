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

    // Estes atributos de atraso vão representar um atraso que o Veiculo irá sofrer no determinado momento da pista,
    //por exemplo, Curva em U, Curva em S, gravilha na pista, borracha na pista…
    //Alguns momentos vão favorecer Veículos mais leves, outros momentos vão favorecer veículos mais potentes.
}
