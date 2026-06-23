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

    public void exibirDetalhes() {
        System.out.println("----- NEED FOR SPEED UNDERGROUND -----");
        System.out.println("Nome: " + this.nome + " | Time: " + this.tempo + " | Record time: " + this.tempoRecordeSeg + " .sec | Distance: " + this.distanciaVoltaM + " | Laps: " + this.quantidadeVoltas);
    }

    Pista pista1 = new Pista("Tokyo Drift", 200, 200, 20,2);
    Pista pista2 = new Pista("Highway to Hell", 200, 200, 20,2);
    Pista pista3 = new Pista("Circuit de Monaco", 200, 200, 20,2);
    Pista pista4 = new Pista("The Death Course", 200, 200, 20,2);
    Pista pista5 = new Pista("The Wheel of Power", 200, 200, 20,2);
    Pista pista6 = new Pista("Casa Cristo", 200, 200, 20,2);
    Pista pista7 = new Pista("The Grid", 200, 200, 20,2);
}
