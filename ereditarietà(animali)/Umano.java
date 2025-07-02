public class Umano extends Animale {
    public Umano(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void faiVerso() {
        System.out.println("Roar!");
    }
}
