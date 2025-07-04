public class CadettoA extends Cadetto {
    private int livelloAddestramento; // Parametro unico

    public CadettoA(String nome, int livelloAddestramento) {
        super(nome);
        this.livelloAddestramento = livelloAddestramento;
    }

    @Override
    public void saluto() {
        System.out.println("CadettoA " + nome + " con livello addestramento " + livelloAddestramento + " dice: Pronto alla missione!");
    }
}
