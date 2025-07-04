// Sottoclasse auto che estende veicolo
public class Auto extends Veicolo {
    private int numeroPorte;

    // Costruttore: chiama il costruttore della superclasse e aggiunge numeroPorte
    public Auto(String marca, String modello, int anno, int numeroPorte) {
        super(marca, modello, anno);
        this.numeroPorte = numeroPorte;
    }

    // Override del toString: aggiunge l'informazione sul numero di porte
    @Override
    public String toString() {
        return super.toString() + ", Numero porte: " + numeroPorte;
    }
}

