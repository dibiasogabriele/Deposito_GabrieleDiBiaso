public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hot-hell");

        // Aggiunta camere normali
        Camera c1 = new Camera(101, 75.50f);
        Camera c2 = new Camera(102, 80.00f);

        // Aggiunta suite
        Suite s1 = new Suite(201, 150.00f, "acqua potabile");
        Suite s2 = new Suite(202, 170.00f, "boh");

        hotel.aggiungiCamera(c1);
        hotel.aggiungiCamera(c2);
        hotel.aggiungiCamera(s1);
        hotel.aggiungiCamera(s2);



        System.out.println("    Numeri camere    ");
        for (Camera c : hotel.getCamere()) {
            c.dettagli(false);  // Solo il numero
        }

        System.out.println("\n    Dettagli completi    ");
        for (Camera c : hotel.getCamere()) {
            c.dettagli(true);   // Tutti i dettagli
            System.out.println();
        }


        int numSuite = Hotel.contaSuite(hotel.getCamere());
        System.out.println("Numero totale di suite: " + numSuite);
    }
}
