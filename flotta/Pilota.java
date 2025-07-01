// Classe Pilota
class Pilota {
    private String nome;
    private String numeroBrevetto;
    private int oreVolo;

    public Pilota(String nome, String numeroBrevetto, int oreVolo) {
        this.nome = nome;
        this.numeroBrevetto = numeroBrevetto;
        setOreVolo(oreVolo);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroBrevetto() {
        return numeroBrevetto;
    }
    public void setNumeroBrevetto(String numeroBrevetto) {
        this.numeroBrevetto = numeroBrevetto;
    }

    public int getOreVolo() {
        return oreVolo;
    }
    public void setOreVolo(int oreVolo) {
        if (oreVolo >= 0) {
            this.oreVolo = oreVolo;
        } else {
            System.out.println("Errore: le ore di volo devono essere maggiori o uguali a zero.");
        }
    }

    @Override
    public String toString() {
        return "Pilota{" +
                "nome='" + nome + '\'' +
                ", numeroBrevetto='" + numeroBrevetto + '\'' +
                ", oreVolo=" + oreVolo +
                '}';
    }
}
