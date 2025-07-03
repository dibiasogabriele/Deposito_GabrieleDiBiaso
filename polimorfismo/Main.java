public class Main {
    public static void main(String[] args) {
        // Creo due persone normali
        Persona p1 = new Persona("Mario");
        Persona p2 = new Persona("Maria");


        p1.saluta();
        p2.saluta();

        // Creo un pirata
        Pirata pirata = new Pirata("Barbanera");

        // Il pirata fa il suo saluto speciale
        pirata.saluta();
    }
}
