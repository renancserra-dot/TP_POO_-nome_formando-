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


    Momento momento1 = new Momento("Curva em S", 15.5, 30);
    Momento momento2 = new Momento("Curva em U", 20, 20);
    Momento momento3 = new Momento("Subida montanhosa", 17.5, 18);
    Momento momento4 = new Momento("Inversão de Marcha", 22.5, 28);
    Momento momento5 = new Momento("Peão na pista", 10, 5);
    Momento momento6 = new Momento("Piso humido", 18.5, 22);
    Momento momento7 = new Momento("Espaço reduzido", 20, 30);

    // Estes atributos de atraso vão representar um atraso que o Veiculo irá sofrer no determinado momento da pista,
    //por exemplo, Curva em U, Curva em S, gravilha na pista, borracha na pista…
    //Alguns momentos vão favorecer Veículos mais leves, outros momentos vão favorecer veículos mais potentes.
}
