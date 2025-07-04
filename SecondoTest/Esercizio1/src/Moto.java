// Sottoclasse moto che estende veicolo
public class Moto extends Veicolo {
    private String tipoManubrio;

    // Costruttore: chiama il costruttore della superclasse e aggiunge tipoManubrio
    public Moto(String marca, String modello, int anno, String tipoManubrio) {
        super(marca, modello, anno);
        this.tipoManubrio = tipoManubrio;
    }

    // Override del toString: aggiunge il tipo di manubrio
    @Override
    public String toString() {
        return super.toString() + ", Tipo manubrio: " + tipoManubrio;
    }
}

