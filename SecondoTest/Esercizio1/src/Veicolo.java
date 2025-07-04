// Classe base che rappresenta un veicolo generico
public class Veicolo {
    protected String marca;
    protected String modello;
    protected int anno;

    // Costruttore che inizializza marca, modello e anno
    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    // Metodo toString per stampare le informazioni del veicolo
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modello: " + modello + ", Anno: " + anno;
    }
}
