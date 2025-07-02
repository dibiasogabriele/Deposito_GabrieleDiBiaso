public class Gatto extends Animale {
    public Gatto(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void faiVerso() {
        System.out.println("Miao!");
    }
}
