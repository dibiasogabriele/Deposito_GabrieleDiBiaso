
public class ContoBancario {
    // Attributi privati (incapsulati)
    private String numeroConto;
    private double saldo;
    private String titolare;

    // Costruttore: inizializza i dati del conto
    public ContoBancario(String numeroConto, String titolare) {
        this.numeroConto = numeroConto;
        this.titolare = titolare;
        this.saldo = 0.0; // saldo iniziale
    }

    // Getter per numero di conto
    public String getNumeroConto() {
        return numeroConto;
    }

    // Getter per il saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter per il titolare
    public String getTitolare() {
        return titolare;
    }

    // Metodo per depositare denaro
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Hai depositato: " + importo + "€");
        } else {
            System.out.println("Importo non valido.");
        }
    }

    // Metodo per prelevare denaro
    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Hai prelevato: " + importo + "€");
        } else {
            System.out.println("Operazione non valida. Fondi insufficienti o importo non valido.");
        }
    }
}
