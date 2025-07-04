public class Furgone extends VeicoloConsegna implements Tracciabile {
    // Estende VeicoloConsegna e implementa la tracciabilità
    public Furgone(String targa, float caricoMassimo) {
        super(targa, caricoMassimo);
    }

    @Override
    public void consegnaPacco(String destinazione, float peso) {
        // Controlla se il peso supera il carico massimo
        if (peso > caricoMassimo) {
            System.out.println("ERRORE: Il pacco supera il carico massimo del furgone.");
            return;
        }
        // Altrimenti esegue la consegna
        System.out.println("Furgone con targa " + targa + " sta consegnando in via  " + destinazione);
    }

    // Implementazione del metodo dell'interfaccia Tracciabile
    @Override
    public void tracciaConsegna(String codiceTracking) {
        System.out.println("Tracking furgone: codice " + codiceTracking + " in transito su strada.");
    }
}
