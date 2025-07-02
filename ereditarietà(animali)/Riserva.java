import java.util.ArrayList;
import java.util.Scanner;

public class Riserva
{
    private ArrayList<Cane> cani = new ArrayList<>();
    private ArrayList<Gatto> gatti = new ArrayList<>();
    private ArrayList<Umano> umani = new ArrayList<>();

    public void aggiungiAnimale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti animali vuoi aggiungere?");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Specie animale (cane/gatto/umano): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Età: ");
            int eta = Integer.parseInt(scanner.nextLine());

            switch (tipo) {
                case "cane":
                    cani.add(new Cane(nome, eta));
                    break;
                case "gatto":
                    gatti.add(new Gatto(nome, eta));
                    break;
                case "umano":
                    umani.add(new Umano(nome, eta));
                    break;
                default:
                    System.out.println("Tipo non riconosciuto.");
            }
        }
    }

    public void mostraTuttiGliAnimali() {
        System.out.println(" Cani ");
        for (Cane c : cani) {
            c.stampaInfo();
        }

        System.out.println(" Gatti ");
        for (Gatto g : gatti) {
            g.stampaInfo();
        }

        System.out.println(" Umani ");
        for (Umano l : umani) {
            l.stampaInfo();
        }
    }
}
