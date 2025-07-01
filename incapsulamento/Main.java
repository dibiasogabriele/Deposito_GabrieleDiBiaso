import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> listaStudenti = new ArrayList<>();

        // Creo 2 studenti
        Studente s1 = new Studente("Mario Rossi", 7);
        Studente s2 = new Studente("Luca Bianchi", 9);

        listaStudenti.add(s1);
        listaStudenti.add(s2);


        // Stampo nome e voto iniziale
        for (Studente s : listaStudenti) {
            System.out.println("Studente: " + s.getNome() + ", voto: " + s.getVoto());
        }

        // Provo a cambiare voto con valori validi e non validi
        System.out.println("\nProvo a modificare i voti:");
        s1.setVoto(11); // non valido
        System.out.println(s1.getNome() + " ha voto: " + s1.getVoto());

        s1.setVoto(8); // valido
        System.out.println(s1.getNome() + " ha voto: " + s1.getVoto());

        // Ricerca studente per nome
        String nomeRicerca = "Luca Bianchi";
        Studente trovato = cercaStudentePerNome(listaStudenti, nomeRicerca);
        if (trovato != null) {
            System.out.println("\nStudente trovato: " + trovato.getNome() + ", voto: " + trovato.getVoto());
        } else {
            System.out.println("\nStudente con nome \"" + nomeRicerca + "\" non trovato.");
        }
    }

    // Metodo di ricerca per nome
    public static Studente cercaStudentePerNome(ArrayList<Studente> lista, String nome) {
        for (Studente s : lista) {
            if (s.getNome().equalsIgnoreCase(nome)) {
                return s;
            }
        }
        return null;
    }
}

