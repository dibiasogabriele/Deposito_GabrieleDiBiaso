import java.util.Scanner;



public class Ricorsione {

        // Esercizio 1: Somma di due numeri
        public static int somma(int a, int b) {
            return a + b;
        }

        // Esercizio 2: Overloading multiply()
        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double multiply(double a, double b, double c) {
            return a * b * c;
        }

        // Esercizio 3: Somma ricorsiva dei numeri naturali
        public static int sommaNaturali(int n) {
            if (n == 1) return 1;
            return n + sommaNaturali(n - 1);
        }

        // Esercizio 4: Passaggio per valore
        public static void modificaValore(int x) {
            x = x + 10;
            System.out.println("Valore modificato ): " + x);
        }

        // Esercizio 4: Passaggio per riferimento
        public static void modificaArray(int[] array) {
            array[0] = array[0] + 100;
            System.out.println("Valore modificato): " + array[0]);
        }






        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String scelta;

            while (true) {
                System.out.println("\n*** MENU ***");
                System.out.println("1. Somma di due numeri");
                System.out.println("2. Moltiplicazione (overloading)");
                System.out.println("3. Somma ricorsiva dei primi n numeri naturali");
                System.out.println("4. Passaggio per valore e per riferimento");
                System.out.println("Scrivi 'fine' per uscire.");
                System.out.print("Scelta: ");
                scelta = scanner.nextLine().toLowerCase();

                if (scelta.equals("fine")) {
                    System.out.println("Programma terminato.");
                    break;
                }

                switch (scelta) {
                    case "1":
                        System.out.print("Inserisci primo numero: ");
                        int a = scanner.nextInt();
                        System.out.print("Inserisci secondo numero: ");
                        int b = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Risultato: " + somma(a, b));
                        break;

                    case "2":
                        System.out.print("Vuoi moltiplicare 2 (int) o 3 (double) numeri? : ");
                        String tipo = scanner.nextLine();
                        if (tipo.equals("2")) {
                            System.out.print("Inserisci primo intero: ");
                            int x = scanner.nextInt();
                            System.out.print("Inserisci secondo intero: ");
                            int y = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Risultato: " + multiply(x, y));
                        } else if (tipo.equals("3")) {
                            System.out.print("Inserisci primo double: ");
                            double d1 = scanner.nextDouble();
                            System.out.print("Inserisci secondo double: ");
                            double d2 = scanner.nextDouble();
                            System.out.print("Inserisci terzo double: ");
                            double d3 = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.println("Risultato: " + multiply(d1, d2, d3));
                        } else {
                            System.out.println("Scelta non valida.");
                        }
                        break;

                    case "3":
                        System.out.print("Inserisci un numero naturale n: ");
                        int n = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Somma ricorsiva dei primi " + n + " numeri naturali: " + sommaNaturali(n));
                        break;

                    case "4":
                        int valore = 20;
                        System.out.println("Valore prima: " + valore);
                        modificaValore(valore);
                        System.out.println("Valore dopo: " + valore);//avendo cambiato una copia dell oggetto, il valore prime e il valore dopo  rimangono gli stessi

                        int[] array = {50};// array con un solo elemento = 50
                        System.out.println("Array[0] prima: " + array[0]);
                        modificaArray(array);
                        System.out.println("Array[0] dopo: " + array[0]);//avendo cambiato l oggetto vero e proprio il valore dopo è stato modificato ed è diverso dal valore prima(acquista la modifica effettuata con il richiamo della funzione)
                        break;

                    default:
                        System.out.println("Scelta non valida. Riprova.");
                }
            }

            scanner.close();
        }
    }


