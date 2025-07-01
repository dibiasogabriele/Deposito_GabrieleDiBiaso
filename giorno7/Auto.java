public class Auto {
    private String targa;
    private String modello;


    //costruttore
    public Auto(String targa, String modello) {
        this.targa = targa;
        this.modello = modello;
    }



    public String getTarga() {
        return targa;
    }

    public String getModello() {
        return modello;
    }


    // grazie all'override, l'ide mi puo segnalare eventuali problemi , come ad esempio non aver sovrascritto correttamente un metodo
    @Override
    public String toString() {
        return "Targa: " + targa + ", Modello: " + modello;
    }
}

