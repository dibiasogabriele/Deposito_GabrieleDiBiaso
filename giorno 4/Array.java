import java.util.Scanner;



public class Array {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);// chiedo quanti dolci diversi vuole ordinare
            final int MAX_DOLCI = 10;
            System.out.print("Quanti dolci diversi vuoi ordinare (max 10)? ");
            int n = input.nextInt();
            input.nextLine();



            // Verifica che il numero non superi il massimo
            while (n < 1 || n > MAX_DOLCI) {
                System.out.print("Numero non valido. Inserisci un numero tra 1 e 10: ");
                n = input.nextInt();
                input.nextLine();
            }



            // due array , uno per il nome uno per la quantità
            String[] nomiDolci = new String[n];
            int[] quantita = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Inserisci il tipo di dolce " + (i + 1) + ": ");
                nomiDolci[i] = input.nextLine();

                int q;
                do {
                    System.out.print("Inserisci la quantità per \"" + nomiDolci[i] + "\": ");
                    q = input.nextInt();
                    if (q < 0) {
                        System.out.println("Errore: la quantità non può essere negativa. Riprova.");
                    }
                } while (q < 0);
                quantita[i] = q;
                input.nextLine();
            }

            // Stampa ordini e quantità
            System.out.println("\n Ordini Effettuati ");
            int totale = 0;
            for (int i = 0; i < n; i++) {
                System.out.println(quantita[i] + " x " + nomiDolci[i]);
                totale += quantita[i];
            }

            System.out.println("Totale dolci ordinati: " + totale);
        }
    }


