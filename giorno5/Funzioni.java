

import java.util.Scanner;

public class Funzioni {

    // Funzione che calcola il fattoriale di un intero
    public static long fattoriale(int n) { // uso long perché il fattoriale cresce molto rapidamente
        if (n < 0) {
            throw new IllegalArgumentException("Il fattoriale non è definito per numeri negativi.");
        }
        long risultato = 1;
        for (int i = 2; i <= n; i++) {
            risultato *= i;
        }
        return risultato;
    }


    // Metodo overloading che accetta una stringa e stampa messaggio di errore + lunghezza
    public static void fattoriale(String input) {
        System.out.println("Inserisci un numero valido");
        System.out.println("Lunghezza della stringa inserita: " + input.length());
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;

        while (!inputValido) {
            System.out.print("Inserisci un numero: ");
            String input = scanner.nextLine();

            try {
                int numero = Integer.parseInt(input); // può lanciare eccezione se non è un intero
                System.out.println(fattoriale(numero));
                inputValido = true;
            } catch (NumberFormatException e) {
                fattoriale(input); // stringa non numerica , messaggio + lunghezza
            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage()); // numero negativo
            }
        }

        scanner.close();
    }
}
