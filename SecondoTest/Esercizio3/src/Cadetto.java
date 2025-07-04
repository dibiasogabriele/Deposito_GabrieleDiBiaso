// Classe base Cadetto con attributo comune nome e metodo polimorfico saluto()
public class Cadetto {
    protected String nome; // Attributo comune

    public Cadetto(String nome) {
        this.nome = nome;
    }

    // Metodo polimorfico: da sovrascrivere nelle classi figlie
    public void saluto() {
        System.out.println("Saluto generico del cadetto " + nome);
    }
}
