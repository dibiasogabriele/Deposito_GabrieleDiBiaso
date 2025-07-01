public class Main {
    public static void main(String[] args) {
        Officina miaOfficina = new Officina();

        // Creo due auto diverse
        Auto auto1 = new Auto("AB123CD", "Fiat Panda");
        Auto auto2 = new Auto("EF456GH", "Volkswagen Golf");

        // Aggiungo le auto all'officina
        miaOfficina.aggiungiAuto(auto1);
        miaOfficina.aggiungiAuto(auto2);

        // Stampo l'elenco delle auto presenti
        miaOfficina.stampaAuto();
    }
}
