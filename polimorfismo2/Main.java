import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hamburger> ordini = new ArrayList<>();

        boolean continua = true;

        while (continua) {
            System.out.println("\n MENU ORDINI ");
            System.out.println("1) Cheeseburger");
            System.out.println("2) VegBurger");
            System.out.println("3) DoubleBacon");
            System.out.println("4) Mostra ordini e prepara");
            System.out.println("5) Esci");
            System.out.print("Scegli il tipo di panino: ");

            String scelta = sc.nextLine();

            switch (scelta) {
                case "1":
                    ordini.add(new Cheeseburger());
                    System.out.println("Cheeseburger aggiunto all'ordine.");
                    break;
                case "2":
                    ordini.add(new VegBurger());
                    System.out.println("VegBurger aggiunto all'ordine.");
                    break;
                case "3":
                    ordini.add(new DoubleBacon());
                    System.out.println("DoubleBacon aggiunto all'ordine.");
                    break;
                case "4":
                    if (ordini.isEmpty()) {
                        System.out.println("Nessun ordine da preparare.");
                    } else {
                        System.out.println("\nPreparazione degli ordini:");
                        for (Hamburger h : ordini) {
                            System.out.print(h.getNome() + ": ");
                            h.prepara();
                        }
                    }
                    break;
                case "5":
                    continua = false;
                    System.out.println("Chiusura dell'hamburgeria. Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }

        sc.close();
    }
}
