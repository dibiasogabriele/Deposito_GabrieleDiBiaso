public class Libro {
    private String titolo;
    private String autore;
    private double prezzo;
    private int codice;

    // variabile statica per generare codici unici
    private static int prossimoCodice = 1;

    // Costruttore
    public Libro(String titolo, String autore, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.codice = prossimoCodice++;  // assegna codice e incrementa
    }


    // Metodo per stampare i dettagli
    public void stampaDettagli() {
        System.out.println("Codice: " + codice);
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Prezzo: €" + prezzo);
        System.out.println(" ");
    }

    // Main di prova
    public static void main(String[] args) {
        Libro libro1 = new Libro("Godel-Escher-Bach", "Douglas Hofstadter", 15.90);
        Libro libro2 = new Libro("1984", "George Orwell", 12.50);

        libro1.stampaDettagli();
        libro2.stampaDettagli();
    }
}

