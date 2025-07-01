

    public static void main(String[] args) {
        CompagniaAerea compagnia = new CompagniaAerea("SkyFly");

        Aereo a1 = new Aereo("Boeing 737", 180, "SKY001");
        Aereo a2 = new Aereo("Airbus A320", 150, "SKY002");

        compagnia.aggiungiAereo(a1);
        compagnia.aggiungiAereo(a2);

        Pilota p1 = new Pilota("Mario Rossi", "BR1234", 1200);
        Pilota p2 = new Pilota("Luisa Bianchi", "BR5678", 850);

        compagnia.aggiungiPilota(p1);
        compagnia.aggiungiPilota(p2);

        compagnia.stampaInfo();
    }

