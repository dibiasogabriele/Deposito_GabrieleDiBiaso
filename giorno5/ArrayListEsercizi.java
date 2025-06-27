import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEsercizi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studenti = new ArrayList<>();// creo arraylist



        //creo il ciclo in modo che possono scrivere nomi fin quando non scrivo fine, nel qual caso esco break

        System.out.println("Inserisci i nomi degli studenti (scrivi 'fine' per terminare):");
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fine")) {
                break;
            }
            if (!nome.isEmpty()) {
                studenti.add(nome);
            }
        }



        Collections.sort(studenti); // ordino gli studenti in ordine alfabetico



        //mi da il numero di studenti attualmente nella lista (studenti.size()) e me li stammpa.


        System.out.println("\nStudenti inseriti (" + studenti.size() + "):");
        for (String s : studenti) {
            System.out.println(s);
        }



        // inserisco il nome dello studente da eliminare con un ciclo che finisce se scrivo fine

        System.out.println("\nInserisci il nome dello studente da eliminare (o scrivi 'fine' per terminare):");
        while (true) {
            String nomeDaEliminare = scanner.nextLine();
            if (nomeDaEliminare.equalsIgnoreCase("fine")) {
                break;
            }


            // se il nome era presente nella lista , correttamente stampo eliminato
            //altrimenti non trovato
            if (studenti.remove(nomeDaEliminare)) {
                System.out.println("Eliminato: " + nomeDaEliminare);
            } else {
                System.out.println("Studente non trovato.");
            }
        }




        // riordino dopo le modifiche
        Collections.sort(studenti);


        // stampo l elenco aggiornato
        System.out.println("\nElenco finale studenti (" + studenti.size() + "):");
        for (String s : studenti) {
            System.out.println(s);
        }

        scanner.close();
    }
}
