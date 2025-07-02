public class Main {
    public static void main(String[] args) {

        Animale[] animali = {
                new Cane("Fido", 3),
                new Gatto("Micio", 2)
        };

        System.out.println("   Lista di Animali  ");
        for (Animale a : animali) {
            a.stampaInfo();
        }

        // Parte 2: uso della classe Riserva
        Riserva riserva = new Riserva();
        riserva.aggiungiAnimale();
        riserva.mostraTuttiGliAnimali();
    }
}
