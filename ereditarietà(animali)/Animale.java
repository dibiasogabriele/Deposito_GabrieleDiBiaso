public class Animale {
    protected String nome;
    protected int eta;

    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void faiVerso() {
        System.out.println("Verso generico...");
    }

    public void stampaInfo() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
        faiVerso();
    }
}
