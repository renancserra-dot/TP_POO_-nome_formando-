package PimpMyRide;

public class Habilidade extends ItemCorrida {

    private int aumentoPotencia;

    public Habilidade(String nome, int precoFichasCorrida, int aumentoPotencia) {
        super(nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }

    public void exibirDetalhes () {

        System.out.println("----- Detalhes de Habilidade -----");
        System.out.println("Nome: " + this.getNome() + " | Aumento de potencia: " + this.aumentoPotencia);
    }

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


}
