import java.util.Random;
import java.util.Scanner;

public class Astronauta {
    protected String nome;
    protected String email;
    protected float creditoOssigeno;//Ossigeno disponibile, rigenerato casualmente
    protected StazioneSpaziale stazione;
    protected int azioniFatte; // Conta azioni svolte (aggiungere esperimenti o valutazioni)



//costruttore Astronauta(imposto le azioni fatte a 0)
    public Astronauta(String nome, String email, StazioneSpaziale stazione) {
        this.nome = nome;
        this.email = email;
        this.stazione = stazione;
        this.azioniFatte = 0;
        rigeneraOssigeno();
    }


// metodo per rigenerare ossigeno
    public void rigeneraOssigeno() {
        // Creo un'istanza di Random per generare numeri casuali
        Random r = new Random();
        this.creditoOssigeno =  r.nextFloat() * 50;// nextfloat in se mi genera un numero casuale (di tipo float) tra 0.0 e 1.0
        // ho moltiplicato per 50 per avere un range piu ampio di numeri casuali
        System.out.printf("Ossigeno rigenerato: %.2f\n", creditoOssigeno);// Stampo a video il valore rigenerato di ossigeno, con due cifre decimali
    }


    public void stampaDati() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.printf("Credito Ossigeno: %.2f\n", creditoOssigeno);//// Stampo a video il valore del credito di ossigeno, con due cifre decimali

    }

   /*   Metodo  che nelle classi figlie sarà sovrascritto
        per definire azioni specifiche, ma qui serve come metodo base
        che permette anche di passare lo Scanner per leggere input.*/
    public void azione(Scanner sc) {
        System.out.println("Azione base di Astronauta: nessuna operazione definita.");
    }




    // Controllo se l'astronauta ha fatto almeno 3 azioni per digi-evolversi
    public boolean isEvoluto() {
        return azioniFatte >= 3;
    }


    // Incremento il contatore azioni
    protected void registraAzione() {
        azioniFatte++;
    }
}



































