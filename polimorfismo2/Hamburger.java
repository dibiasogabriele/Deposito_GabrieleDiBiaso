public class Hamburger {
    protected String nome;

    // Costruttore che imposta il nome del panino
    public Hamburger(String nome) {
        this.nome = nome;
    }

    // Metodo per restituire il nome del panino
    public String getNome() {
        return nome;
    }

    // Metodo prepara: stampa la preparazione generica (da sovrascrivere)
    public void prepara() {
        System.out.println("Preparazione panino generico.");
    }
}
