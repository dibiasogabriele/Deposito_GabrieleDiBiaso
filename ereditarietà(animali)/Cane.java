public class Cane extends Animale {

    public Cane(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void faiVerso() {
        System.out.println("Bau!");
    }
}
