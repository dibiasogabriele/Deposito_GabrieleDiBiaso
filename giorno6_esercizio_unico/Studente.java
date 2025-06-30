

    class Studente {
        String nome; // Variabile di istanza
        static int totaleStudenti = 0; // Variabile statica

        Studente(String nome) {
            this.nome = nome;
             totaleStudenti++; // Incremento per ogni nuovo oggetto
             }

}
