public class Suite extends Camera {
    private String serviziExtra;

    public Suite(int numero, float prezzo, String serviziExtra) {
        super(numero, prezzo);
        this.serviziExtra = serviziExtra;
    }

    public String getServiziExtra() {
        return serviziExtra;
    }

    public void setServiziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    // Override del metodo dettagli
    @Override
    public void dettagli() {
        super.dettagli();
        System.out.println("Servizi extra: " + serviziExtra);
    }


    @Override
    public void dettagli(boolean conPrezzo) {
        if (conPrezzo) {

            System.out.println("Camera numero: " + getNumero() + ", Prezzo: " + getPrezzo() + "€");
            System.out.println("Servizi extra: " + serviziExtra);
        } else {
            System.out.println("Camera numero: " + getNumero());
        }
    }


}
