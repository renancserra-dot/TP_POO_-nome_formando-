package Veiculos;

import PimpMyRide.ItemCorrida;

import java.util.ArrayList;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected int potenciaCV;
    protected double pesoKg;
    protected int desgaste;
    protected int preco;
    protected ArrayList<ItemCorrida> inventarioItem;

    public Veiculo(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.pesoKg = pesoKg;
        this.desgaste = desgaste;
        this.preco = preco;
        this.inventarioItem = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("---- Detalhes do veículo ----");
        System.out.println("Marca: " + this.marca + " | Modelo: " + this.modelo + " | Potencia CV: " + this.potenciaCV + " | Peso: " + this.pesoKg + " .Kg | Desgaste: " + this.desgaste + " | Preço: " + this.preco + " €.");

    }

    /**
     * Metodo para adicionar item ao Veiculo
     * @param itemNovo
     */

    public void adicionarItem(ItemCorrida itemNovo) {
        this.inventarioItem.add(itemNovo);
        System.out.println("Item " + itemNovo.getNome() + " adicionado ao veículo.");
    }

}
