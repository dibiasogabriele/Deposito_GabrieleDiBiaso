import java.util.Scanner;

public class Scienziato extends Astronauta {


    // costruttore (con super lo derivo da astronauta)
    public Scienziato(String nome, String email, StazioneSpaziale stazione) {
        super(nome, email, stazione);
    }




    @Override
    public void azione(Scanner sc) {
        System.out.println("Inserisci il nome dell'esperimento da aggiungere:");
        String esp = sc.nextLine();
        // Chiamo il metodo della StazioneSpaziale per aggiungere il nuovo esperimento
        stazione.aggiungiEsperimento(esp);
        System.out.println("Esperimento aggiunto con successo.");
        registraAzione();    // Registro l’azione: incrementando il contatore delle azioni svolte
        //posso  far “digi-evolvere” lo Scienziato.
    }
}
