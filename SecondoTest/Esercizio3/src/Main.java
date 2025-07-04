import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero tra 1 e 3:");
        int scelta = 0;

        try {
            scelta = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Input non valido.");
            sc.close();
            return;
        }

        if (scelta < 1 || scelta > 3) {
            System.out.println("Numero fuori dal range.");
            sc.close();
            return;
        }

        Cadetto cadetto = null;

        switch (scelta) {
            case 1:
                System.out.print("Inserisci nome del CadettoA: ");
                String nomeA = sc.nextLine();
                System.out.print("Inserisci livello addestramento (int): ");
                int livello = Integer.parseInt(sc.nextLine());
                cadetto = new CadettoA(nomeA, livello);
                break;
            case 2:
                System.out.print("Inserisci nome del CadettoB: ");
                String nomeB = sc.nextLine();
                System.out.print("Inserisci specializzazione: ");
                String spec = sc.nextLine();
                cadetto = new CadettoB(nomeB, spec);
                break;
            case 3:
                System.out.print("Inserisci nome del CadettoC: ");
                String nomeC = sc.nextLine();
                System.out.print("Inserisci punteggio (double): ");
                double punteggio = Double.parseDouble(sc.nextLine());
                cadetto = new CadettoC(nomeC, punteggio);
                break;
        }

        // Polimorfismo: il metodo chiamato dipende dalla classe reale dell’oggetto
        cadetto.saluto();

        sc.close();
    }
}
