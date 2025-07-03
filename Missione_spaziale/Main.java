import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static StazioneSpaziale stazione = new StazioneSpaziale();
    private static Astronauta astronauta = null;  //  Riferimento all’astronauta corrente (null finché non ne creo uno)

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            //  Stampo le opzioni del menu
            System.out.println("\n--- MENU PRINCIPALE ---");
            System.out.println("1) Crea nuovo astronauta");
            System.out.println("2) Visualizza dati astronauta");
            System.out.println("3) Login (rigenera ossigeno)");
            System.out.println("4) Interagisci con profilo");
            System.out.println("5) Esci");
            System.out.print("Scegli: ");
            String scelta = sc.nextLine();//  Leggo la scelta dell’utente


            switch (scelta) {
                //  Creazione di un nuovo Astronauta
                case "1":
                    creaAstronauta();
                    break;
                //  Visualizzazione dei dati (se esiste un astronauta)
                case "2":
                    if (astronauta == null) {
                        System.out.println("Nessun astronauta creato.");
                    } else {
                        astronauta.stampaDati();
                    }
                    break;
                //  “Login” rigenera ossigeno (se esiste un astronauta)
                case "3":
                    if (astronauta == null) {
                        System.out.println("Nessun astronauta creato.");
                    } else {
                        astronauta.rigeneraOssigeno();
                    }
                    break;
                //  Interazione con il profilo (azioni specifiche)
                case "4":
                    if (astronauta == null) {
                        System.out.println("Nessun astronauta creato.");
                    } else {
                        interagisci();
                    }
                    break;
                case "5":
                    running = false;
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }


    // Metodo per creare un nuovo Astronauta e assegnargli un ruolo
    private static void creaAstronauta() {
        System.out.print("Inserisci il nome: ");
        String nome = sc.nextLine();
        System.out.print("Inserisci l'email: ");
        String email = sc.nextLine();

        System.out.print("Qual è il tuo pianeta preferito? ");
        String pianeta = sc.nextLine().trim().toLowerCase();
        // Se l’utente risponde "terra" diventa Scienziato, altrimenti Ispettore
        if (pianeta.equals("terra")) {
            astronauta = new Scienziato(nome, email, stazione);
            System.out.println("Astronauta creato come Scienziato.");
        } else {
            astronauta = new Ispettore(nome, email, stazione);
            System.out.println("Astronauta creato come Ispettore.");
        }
    }


    // Metodo per eseguire l’azione specifica e gestire l’evoluzione del profilo
    private static void interagisci() {
        // Se è un Scienziato e ha fatto ≥3 azioni, lo trasformo in ScienziatoCapo
        if (astronauta instanceof Scienziato && astronauta.isEvoluto() && !(astronauta instanceof ScienziatoCapo)) {
            astronauta = new ScienziatoCapo(astronauta.nome, astronauta.email, stazione);
            System.out.println("Evoluzione: Sei diventato uno Scienziato Capo!");
            // Se è un Ispettore e ha fatto ≥3 azioni, lo trasformo in IspettoreEsperto

        } else if (astronauta instanceof Ispettore && astronauta.isEvoluto() && !(astronauta instanceof IspettoreEsperto)) {
            astronauta = new IspettoreEsperto(astronauta.nome, astronauta.email, stazione);
            System.out.println("Evoluzione: Sei diventato un Ispettore Esperto!");
        }
        astronauta.azione(sc);
    }
}
