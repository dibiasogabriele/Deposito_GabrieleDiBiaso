public class Pirata extends Persona {

    // Costruttore che richiama il costruttore della superclasse
    public Pirata(String nome) {
        super(nome);
    }

    // Override del metodo saluta con un saluto da pirata
    @Override
    public void saluta() {
        System.out.println("Ahoy! Sono il pirata " + nome + "!");
    }
}

