import java.util.Scanner;

public class Persona {
    private String nome;
    private int eta;
    private String citta;

    // Costruttore che prende nome da Scanner e il resto predefinito
    public Persona(Scanner scanner) {
        System.out.print("Inserisci il nome: ");
        this.nome = scanner.nextLine();
        this.eta = 30;
        this.citta = "Roma";
    }

    // Costruttore con parametri personalizzati
    public Persona(String nome, int eta, String citta) {
        this.nome = nome;
        this.eta = eta;
        this.citta = citta;
    }

    // Metodo per stampare i dettagli
    public void stampaDati() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
        System.out.println("Città: " + citta);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creo due persone usando il costruttore con Scanner per il nome
        Persona p1 = new Persona(scanner);
        Persona p2 = new Persona(scanner);


        p1.stampaDati();
        p2.stampaDati();

        scanner.close();
    }
}
