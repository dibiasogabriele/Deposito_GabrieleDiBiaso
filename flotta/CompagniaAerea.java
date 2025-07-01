import java.util.ArrayList;

// Classe CompagniaAerea
class CompagniaAerea {
    private String nome;
    private ArrayList<Aereo> flotta;
    private ArrayList<Pilota> piloti;

    public CompagniaAerea(String nome) {
        this.nome = nome;
        this.flotta = new ArrayList<>();
        this.piloti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aggiungiAereo(Aereo aereo) {
        flotta.add(aereo);
    }

    public void aggiungiPilota(Pilota pilota) {
        piloti.add(pilota);
    }

    public void stampaInfo() {
        System.out.println("Compagnia Aerea: " + nome);
        System.out.println("Flotta:");
        for (Aereo a : flotta) {
            System.out.println(a);
        }
        System.out.println("Piloti:");
        for (Pilota p : piloti) {
            System.out.println(p);
        }
    }
}