import java.util.Scanner;

public class IspettoreEsperto extends Ispettore {

    // costruttore (con super lo derivo da ispettore)

    public IspettoreEsperto(String nome, String email, StazioneSpaziale stazione) {
        super(nome, email, stazione);
    }


    // metodo per stampare tutte le valutazioni insieme
    public void stampaTutteValutazioni() {
        System.out.println("Tutte le valutazioni:");
        stazione.stampaValutazioni();
    }




    //  Mostro il menu delle operazioni avanzate per l’ispettore esperto
    @Override
    public void azione(Scanner sc) {
        System.out.println("Operazioni disponibili:");
        System.out.println("1) Inserisci valutazione");
        System.out.println("2) Stampa tutte le valutazioni");
        System.out.print("Scegli: ");
        String scelta = sc.nextLine();// leggo la scelta dell' utente

        switch (scelta) {
            case "1":
                //  Selezione dell’inserimento di una valutazione
                if (stazione.numeroEsperimenti() == 0) {
                    System.out.println("Nessun esperimento su cui inserire valutazioni.");
                    return;
                }
                System.out.println("Inserisci il numero dell'esperimento da valutare:");
                int n;
                try {
                    n = Integer.parseInt(sc.nextLine());// converto la stringa in un intero con parsing
                } catch (Exception e) {
                    // Se l’input non è un numero intero valido
                    System.out.println("Input non valido.");
                    return;
                }

                // Verifico che il numero scelto rientri nell’elenco
                if (n < 1 || n > stazione.numeroEsperimenti()) {
                    System.out.println("Esperimento non valido.");
                    return;
                }

                // Chiedo il voto da assegnare (1–5)
                System.out.println("Inserisci la valutazione (1-5):");
                int voto;
                try {
                    voto = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Input non valido.");
                    return;
                }

                // Provo ad inserire la valutazione e verifico l’esito
                if (!stazione.inserisciValutazione(n - 1, voto)) {
                    System.out.println("Valutazione non valida.");
                } else {
                    System.out.println("Valutazione inserita con successo.");
                    registraAzione();
                }
                break;
            case "2":
                //  Selezione della stampa di tutte le valutazioni
                stampaTutteValutazioni();// Metodo di IspettoreEsperto che le elenca
                break;
            default:
                // Scelta diversa da "1" o "2"(essendo solo due le condizioni degli switch)
                System.out.println("Scelta non valida.");
        }
    }
}
