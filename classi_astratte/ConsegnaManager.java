import java.util.ArrayList;
import java.util.Scanner;

public class ConsegnaManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<VeicoloConsegna> veicoli = new ArrayList<>();// Lista dei veicoli inseriti

        boolean running = true;// Variabile per mantenere attivo il menu

        while (running) {
            System.out.println("\n   MENU CONSEGNE   ");
            System.out.println("1) Aggiungi Furgone");
            System.out.println("2) Aggiungi Drone");
            System.out.println("3) Mostra e Avvia Consegne");
            System.out.println("4) Esci");
            System.out.print("Scelta: ");
            String scelta = sc.nextLine();



            //ho unito i due case perche condividono le stesse info (uno per il furgone e l'altro per il drone)
            switch (scelta) {
                case "1":
                case "2":
                    System.out.print("Inserisci targa: ");
                    String targa = sc.nextLine();
                    System.out.print("Inserisci carico massimo (kg): ");
                    float carico = Float.parseFloat(sc.nextLine());

                    VeicoloConsegna veicolo;
                    if (scelta.equals("1")) {
                        veicolo = new Furgone(targa, carico);
                    } else {
                        veicolo = new Drone(targa, carico);
                    }

                    veicoli.add(veicolo);
                    System.out.println("Veicolo aggiunto con successo.");
                    break;

                case "3":
                    if (veicoli.isEmpty()) {
                        System.out.println("Nessun veicolo disponibile.");
                        break;
                    }
                    for (VeicoloConsegna v : veicoli) {
                        v.stampaInfo();
                        System.out.print("Inserisci destinazione: ");
                        String destinazione = sc.nextLine();
                        System.out.print("Inserisci peso del pacco (kg): ");
                        float peso = Float.parseFloat(sc.nextLine());
                        v.consegnaPacco(destinazione, peso);

                        // Se il veicolo è tracciabile, esegue anche tracking
                        if (v instanceof Tracciabile) {
                            System.out.print("Inserisci codice tracking: ");
                            String codice = sc.nextLine();
                            ((Tracciabile) v).tracciaConsegna(codice);
                        }
                        System.out.println("---");
                    }
                    break;

                case "4":
                    running = false;
                    System.out.println("Chiusura sistema di consegna.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }

        sc.close();
    }
}

