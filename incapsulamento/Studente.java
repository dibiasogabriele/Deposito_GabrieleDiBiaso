import java.util.ArrayList;

class Studente {
    private String nome;
    private int voto;
    private static int idCounter = 0;
    private int id;


    //costruttore
    public Studente(String nome, int voto) {
        this.nome = nome;
        this.setVoto(voto); // uso il setter per validare il voto
        this.id = ++idCounter;
    }


    // metodi getter per ottenere i dati
    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public int getId() {
        return id;
    }


    // setter per impostare voto
    public void setVoto(int voto) {
        if (voto >= 0 && voto <= 10) {
            this.voto = voto;
        } else {
            System.out.println("Errore: voto deve essere tra 0 e 10. Voto non modificato.");
        }
    }
}

