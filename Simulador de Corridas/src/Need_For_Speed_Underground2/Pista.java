package Need_For_Speed_Underground2;

import java.util.ArrayList;

public class Pista {
    protected String nome;
    protected double tempo;
    protected double tempoRecordeSeg;
    protected double distanciaVoltaM;
    protected int quantidadeVoltas;
    protected ArrayList<Momento> momentosPista;

    public Pista(String nome, double tempo, double tempoRecordeSeg, double distanciaVoltaM, int quantidadeVoltas) {
        this.nome = nome;
        this.tempo = tempo;
        this.tempoRecordeSeg = tempoRecordeSeg;
        this.distanciaVoltaM = distanciaVoltaM;
        this.quantidadeVoltas = quantidadeVoltas;
        this.momentosPista = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getTempoRecordeSeg() {
        return tempoRecordeSeg;
    }

    public void setTempoRecordeSeg(double tempoRecordeSeg) {
        this.tempoRecordeSeg = tempoRecordeSeg;
    }

    public double getDistanciaVoltaM() {
        return distanciaVoltaM;
    }

    public void setDistanciaVoltaM(double distanciaVoltaM) {
        this.distanciaVoltaM = distanciaVoltaM;
    }

    public int getQuantidadeVoltas() {
        return quantidadeVoltas;
    }

    public void setQuantidadeVoltas(int quantidadeVoltas) {
        this.quantidadeVoltas = quantidadeVoltas;
    }

    public ArrayList<Momento> getMomentosPista() {
        return momentosPista;
    }

    public void setMomentosPista(ArrayList<Momento> momentosPista) {
        this.momentosPista = momentosPista;
    }

    public void adicionarMomento(Momento momento) {
        this.momentosPista.add(momento);
    }

    public void mostrarDetalhes() {
        System.out.println("----- NEED FOR SPEED UNDERGROUND -----");
        System.out.println("Nome: " + this.nome
                + " | Tempo recorde: " + this.tempoRecordeSeg + " seg"
                + " | Distância por volta: " + this.distanciaVoltaM + " m"
                + " | Voltas: " + this.quantidadeVoltas
                + " | Momentos: " + this.momentosPista.size());
    }
}
