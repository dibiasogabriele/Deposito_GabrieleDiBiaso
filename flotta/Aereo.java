



// Classe Aereo
class Aereo {
    private String modello;
    private int numeroPosti;
    private String codice;

    public Aereo(String modello, int numeroPosti, String codice) {
        this.modello = modello;
        setNumeroPosti(numeroPosti); // uso setter per validazione
        this.codice = codice;
    }


    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }
    public void setNumeroPosti(int numeroPosti) {
        if (numeroPosti > 0) {
            this.numeroPosti = numeroPosti;
        } else {
            System.out.println("Errore: il numero di posti deve essere positivo.");
        }
    }

    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }



    @Override
    public String toString() {
        return "Aereo{" +
                "modello='" + modello + '\'' +
                ", numeroPosti=" + numeroPosti +
                ", codice='" + codice + '\'' +
                '}';
    }
}





