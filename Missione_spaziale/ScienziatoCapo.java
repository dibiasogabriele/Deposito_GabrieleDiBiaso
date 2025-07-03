import java.util.Scanner;

public class ScienziatoCapo extends Scienziato {



    // costruttore (con super richiamo scienziato)
    public ScienziatoCapo(String nome, String email, StazioneSpaziale stazione) {
        super(nome, email, stazione);
    }


    // metodo per stampare gli esperimenti in una sola volta
    public void stampaTuttiEsperimenti() {
        System.out.println("Tutti gli esperimenti:");
        stazione.stampaEsperimenti();
    }




    @Override
    public void azione(Scanner sc) {

        // Mostro le operazioni disponibili allo Scienziato Capo
        System.out.println("Operazioni disponibili:");
        System.out.println("1) Aggiungi esperimento");
        System.out.println("2) Stampa tutti gli esperimenti");
        System.out.print("Scegli: ");
        String scelta = sc.nextLine();


        // anche qui eseguo due scelte con lo switch come in ispettoreEsperto
        switch (scelta) {
            case "1":
                // qui  l'utente vuole aggiungere un nuovo esperimento
                System.out.println("Inserisci il nome dell'esperimento da aggiungere:");
                String esp = sc.nextLine();
                stazione.aggiungiEsperimento(esp);// Lo aggiungo alla stazione
                System.out.println("Esperimento aggiunto con successo.");
                registraAzione();// Incremento il contatore azioni
                break;
            case "2":
                // qui  l'utente vuole vedere tutti gli esperimenti insieme
                stampaTuttiEsperimenti();// Chiamo il metodo specifico
                break;
            default:
                // Scelta diversa da "1" o "2"(essendo solo due le condizioni degli switch)
                System.out.println("Scelta non valida.");
        }
    }
}
