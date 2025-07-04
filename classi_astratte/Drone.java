public class Drone extends VeicoloConsegna implements Tracciabile {
    // Estende VeicoloConsegna e implementa la tracciabilità

    public Drone(String targa, float caricoMassimo) {
        super(targa, caricoMassimo);
    }

    @Override
    public void consegnaPacco(String destinazione, float peso) {
        if (peso > caricoMassimo) {
            System.out.println("ERRORE: Il pacco supera il carico massimo del drone.");
            return;
        }
        System.out.println("Drone con targa " + targa + " va verso " + destinazione);
    }

    @Override
    public void tracciaConsegna(String codiceTracking) {
        System.out.println("Tracking drone automatico: codice " + codiceTracking + " rilevato in volo.");
    }
}
