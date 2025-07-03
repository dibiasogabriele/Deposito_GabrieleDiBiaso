public class Persona {
    protected String nome;

    // Costruttore che inizializza il nome
    public Persona(String nome) {
        this.nome = nome;
    }

    // Metodo saluta con un saluto base
    public void saluta() {
        System.out.println("Ciao, sono " + nome + "!");
    }
}

