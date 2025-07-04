public class CadettoB extends Cadetto {
    private String specializzazione; // Parametro unico

    public CadettoB(String nome, String specializzazione) {
        super(nome);
        this.specializzazione = specializzazione;
    }

    @Override
    public void saluto() {
        System.out.println("CadettoB " + nome + ", specialista in " + specializzazione + ", saluta con onore.");
    }
}
