package PimpMyRide;

public abstract class ItemCorrida {

    protected String nome;
    protected int precoFichasCorrida;

    public ItemCorrida(String nome, int precoFichasCorrida) {
        this.nome = nome;
        this.precoFichasCorrida = precoFichasCorrida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrecoFichasCorrida() {
        return precoFichasCorrida;
    }

    public void setPrecoFichasCorrida(int precoFichasCorrida) {
        this.precoFichasCorrida = precoFichasCorrida;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.nome + " | Preço: " + this.precoFichasCorrida);
    }
}
