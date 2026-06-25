package Veiculos;

import Enums.TipoMoto;
import PimpMyRide.Habilidade;

import java.util.ArrayList;

public class Mota extends Veiculo {

    private TipoMoto tipoMoto;
    private ArrayList<Habilidade> habilidadesMota;

    public Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoMoto tipoMoto) {
        super(marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoMoto = tipoMoto;
        this.habilidadesMota = new ArrayList<>();
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public ArrayList<Habilidade> getHabilidadesMota() {
        return habilidadesMota;
    }

    public void aplicarHabilidade(Habilidade habilidade) {
        this.habilidadesMota.add(habilidade);
        this.adicionarItem(habilidade);
        this.setPotenciaCV(this.getPotenciaCV() + habilidade.getAumentoPotencia());
        System.out.println("Habilidade " + habilidade.getNome() + " aplicada com sucesso à " + this.modelo + ".");
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tipo de Mota: " + this.tipoMoto + " | Habilidades: " + this.habilidadesMota.size());
    }
}
