import java.util.Scanner;

public class Ispettore extends Astronauta {


    // costruttore (con super o derivo da astronauta)
    public Ispettore(String nome, String email, StazioneSpaziale stazione) {
        super(nome, email, stazione);
    }





    @Override
    public void azione(Scanner sc) {
        if (stazione.numeroEsperimenti() == 0) {
            System.out.println("Nessun esperimento su cui inserire valutazioni.");
            return;
        }

        // Chiedo all’utente quale esperimento vuole valutare
        System.out.println("Inserisci il numero dell'esperimento da valutare:");
        int n;
        try {
            n = Integer.parseInt(sc.nextLine()); // leggo una riga dallo scanner e cerco di trasformarla in intero con il parsing
        } catch (Exception e) {
            System.out.println("Input non valido.");// Se il parsing fallisce (input non numerico), avviso e termino
            return;
        }

        //  Verifico che il numero scelto rientri nell’elenco degli esperimenti
        if (n < 1 || n > stazione.numeroEsperimenti()) {
            System.out.println("Esperimento non valido.");
            return;
        }

        // 4) Chiedo poi la valutazione (da 1 a 5)
        System.out.println("Inserisci la valutazione (1-5):");
        int voto;
        try {
            voto = Integer.parseInt(sc.nextLine());// faccio anche qui il parsing
        } catch (Exception e) {
            System.out.println("Input non valido.");
            return;
        }



        // controllo se l'inserimento è andato a buon fine
        // controllo se sta nella giusta posizione e se è compreso tra 1 e 5
        if (!stazione.inserisciValutazione(n - 1, voto)) {
            System.out.println("Valutazione non valida.");
        } else {
            System.out.println("Valutazione inserita con successo.");
            registraAzione();
        }
    }
}

