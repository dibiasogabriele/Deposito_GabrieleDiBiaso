import java.util.ArrayList;

public class StazioneSpaziale {
    private ArrayList<String> esperimenti;
    private ArrayList<Integer> valutazioni;




    //costruttore per inizializzare gli arraylist
    public StazioneSpaziale() {
        esperimenti = new ArrayList<>();
        valutazioni = new ArrayList<>();
    }


    // metodo per aggiungere un esperimento e la valutazione corrispondente
    public void aggiungiEsperimento(String esp) {
        esperimenti.add(esp);
        valutazioni.add(0);
    }




    public boolean inserisciValutazione(int indice, int voto) {
        if (indice < 0 || indice >= esperimenti.size()) return false;// l indice   corrispondente al voto che sarà inserito, non può essere minore di 0 ne maggiore degli esperimenti
        if (voto < 1 || voto > 5) return false;// il voto deve essere compreso tra 1 e 5
        valutazioni.set(indice, voto);
        return true;
    }

    // metodo per stampare esperimenti
    // entro nell' if se non ci sono esperimenti, altrimenti con un for itero fino al numero di esperimenti fatti
    // e aggiungo la corrispettiva valutazione
    public void stampaEsperimenti() {
        if (esperimenti.isEmpty()) {
            System.out.println("Nessun esperimento registrato.");
            return;
        }
        for (int i = 0; i < esperimenti.size(); i++) {
            System.out.printf("%d) %s - Valutazione: %d\n", i + 1, esperimenti.get(i), valutazioni.get(i));
        }
    }


    // metodo inverso del precedente (se da li vado dall esperimento alla valutazione, qui fa il contrario)
    public void stampaValutazioni() {
        if (valutazioni.isEmpty()) {
            System.out.println("Nessuna valutazione registrata.");
            return;
        }
        for (int i = 0; i < valutazioni.size(); i++) {
            System.out.printf("%d) Valutazione esperimento '%s': %d\n", i + 1, esperimenti.get(i), valutazioni.get(i));
        }
    }



    // metodo per avere il numero totale di esperimenti inseriti
    public int numeroEsperimenti() {
        return esperimenti.size();
    }
}
