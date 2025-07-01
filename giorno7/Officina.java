import java.util.ArrayList;

public class Officina {
    private ArrayList<Auto> listaAuto;


    //creo oggetto listaAuto
    public Officina() {
        listaAuto = new ArrayList<>();
    }

    //metodo per aggiugnere auto alla lista
    public void aggiungiAuto(Auto auto) {
        listaAuto.add(auto);
    }


    public void stampaAuto() {
        if (listaAuto.isEmpty()) {
            System.out.println("Nessuna auto presente in officina.");
        } else {
            System.out.println("Elenco delle auto in officina:");
            for (Auto auto : listaAuto) {
                System.out.println(auto);
            }
        }
    }
}

