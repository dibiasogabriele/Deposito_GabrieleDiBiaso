import java.util.Scanner;

public class Condizioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // chiedo l'età
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        boolean maggiorenne = false;
        if (eta >= 18) {
            System.out.println("accesso potenzialmente consentito.");
            maggiorenne = true;
        } else {
            System.out.println("accesso negato.");
        }

        // chiedo biglietto
        System.out.print("Hai un biglietto valido? (true/false): ");
        boolean bigliettoValido = scanner.nextBoolean();
        if (bigliettoValido) {
            System.out.println("accesso  consentito.");
        } else {
            System.out.println("accesso negato.");
        }

        // chiedo se ccompagnato da adulto
        System.out.print("Sei accompagnato da un adulto? (true/false): ");
        boolean accompagnato = scanner.nextBoolean();
        if (accompagnato) {
            System.out.println("Sei accompagnato da un adulto.");
        } else {
            System.out.println("Non sei accompagnato.");
        }

        // chiedo se ha pzione salta la fila
        System.out.print("Hai acquistato l'opzione 'Salta la fila'? (true/false): ");
        boolean saltaFila = scanner.nextBoolean();
        if (saltaFila) {
            System.out.println("Hai diritto a saltare la fila.");
        } else {
            System.out.println("Non hai l'opzione 'Salta la fila'.");
        }




        scanner.close();
    }
}
