import java.util.Scanner;


public class Cicli {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final String PASSWORD_CORRETTA = "java123";
            int tentativi = 0;
            boolean accessoRiuscito = false;

            // Ciclo while per massimo 3 tentativi
            while (tentativi < 3 && !accessoRiuscito) {
                System.out.print("Inserisci la password: ");
                String password = scanner.nextLine();

                if (password.equals(PASSWORD_CORRETTA)) {
                    accessoRiuscito = true;
                } else {
                    tentativi++;
                    System.out.println("Password errata. Tentativi rimanenti: " + (3 - tentativi));
                }
            }

            if (accessoRiuscito) {
                String risposta;
                // Ciclo do-while per conferma finale
                do {
                    System.out.print("Vuoi accedere al sistema? (s/n): ");
                    risposta = scanner.nextLine().toLowerCase(); // Accetta sia S che s
                } while (!risposta.equals("s") && !risposta.equals("n"));

                if (risposta.equals("s")) {
                    System.out.println("Accesso al sistema effettuato");
                } else {
                    System.out.println("Accesso annullato");
                }
            } else {
                System.out.println("Accesso bloccato");
            }

            scanner.close();
        }
    }

