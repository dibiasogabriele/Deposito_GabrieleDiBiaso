public class CadettoC extends Cadetto {
    private double punteggio; // Parametro unico

    public CadettoC(String nome, double punteggio) {
        super(nome);
        this.punteggio = punteggio;
    }

    @Override
    public void saluto() {
        System.out.println("CadettoC " + nome + " con punteggio " + punteggio + " dice: Preparato e determinato!");
    }
}
