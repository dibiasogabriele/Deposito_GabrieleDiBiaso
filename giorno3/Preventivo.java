import java.util.Scanner;

public class Preventivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double prezzoBase = 500.0;
        double prezzoFinale = prezzoBase;

        // chiedo età del conducente
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        if (eta < 18) {
            System.out.println("Non sei idoneo per l'assicurazione");
            return;
        } else if (eta <= 25) {
            prezzoFinale *= 1.20;  // Maggiorazione del 20%
        } else if (eta > 50) {
            prezzoFinale *= 0.90;  // Sconto del 10%
        }

        // chiedo anni di esperienza
        System.out.print("Inserisci gli anni di esperienza alla guida: ");
        int anniEsperienza = scanner.nextInt();

        if (anniEsperienza < 2) {
            prezzoFinale *= 1.30;  // Maggiorazione del 30%
        }

        //chiedo numero di incidenti
        System.out.print("Inserisci il numero di incidenti negli ultimi 5 anni: ");
        int incidenti = scanner.nextInt();

        if (incidenti > 4) {
            System.out.println("Non sei idoneo per l'assicurazione");
            return;
        } else if (incidenti == 1) {
            prezzoFinale *= 1.15;  // Aumento del 15%
        } else if (incidenti >= 2) {
            prezzoFinale *= 1.30;  // Aumento del 30%
        }

        // Scelta del pacchetto assicurativo
        System.out.print("Scegli il pacchetto assicurativo (Base/Intermedio/Premium): ");
        scanner.nextLine();
        String pacchetto = scanner.nextLine().toLowerCase();

        switch (pacchetto) {
            case "base":
                // Nessuna variazione
                break;
            case "intermedio":
                prezzoFinale *= 1.20;  // +20%
                break;
            case "premium":
                prezzoFinale *= 1.50;  // +50%
                break;
            default:
                System.out.println("Pacchetto non valido.");
                return;
        }


        System.out.printf("Il prezzo finale della tua assicurazione è: %.2f €%n", prezzoFinale);
    }
}
