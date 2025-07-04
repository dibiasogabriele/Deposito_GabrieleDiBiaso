
public class Main {
    public static void main(String[] args) {
        // Creazione di un conto
        ContoBancario conto = new ContoBancario("IT1234567890", "Mario Rossi");

        // Stampa informazioni iniziali
        System.out.println("Conto creato per: " + conto.getTitolare());
        System.out.println("Numero conto: " + conto.getNumeroConto());
        System.out.println("Saldo iniziale: " + conto.getSaldo() + "€");

        // Operazioni sul conto
        conto.deposita(500);     // deposito
        conto.preleva(200);      // prelievo
        conto.preleva(400);      // tentativo fallito

        // Saldo finale
        System.out.println("Saldo finale: " + conto.getSaldo() + "€");
    }
}
