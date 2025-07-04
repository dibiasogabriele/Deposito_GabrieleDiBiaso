
// Classe astratta che rappresenta un veicolo generico per le consegne

public abstract class VeicoloConsegna {
    protected String targa;
    protected float caricoMassimo;


    // Costruttore
    public VeicoloConsegna(String targa, float caricoMassimo) {
        this.targa = targa;
        this.caricoMassimo = caricoMassimo;
    }

    // Metodo astratto: da implementare nelle sottoclassi
    // Ogni veicolo consegna in modo diverso
    public abstract void consegnaPacco(String destinazione, float peso);

    // Metodo concreto condiviso: stampa le informazioni del veicolo
    public void stampaInfo() {
        System.out.println("Targa: " + targa + ", Carico massimo: " + caricoMassimo + "kg");
    }
}
