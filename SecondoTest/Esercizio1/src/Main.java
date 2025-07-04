
public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Auto
        Auto auto = new Auto("Fiat", "Punto", 2010, 5);

        // Creazione di un oggetto Moto
        Moto moto = new Moto("Yamaha", "MT-07", 2021, "Sportivo");

        // Stampa delle informazioni
        System.out.println("Informazioni Auto:");
        System.out.println(auto);

        System.out.println("\nInformazioni Moto:");
        System.out.println(moto);
    }
}
