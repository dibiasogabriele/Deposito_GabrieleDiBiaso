
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        User currentUser = null;

        while (true) {
            System.out.println("\n  MENU  ");
            System.out.println("1. Registra utente");
            System.out.println("2. Aggiungi libro");
            System.out.println("3. Mostra tutti i libri");
            System.out.println("4. Cerca libro");
            System.out.println("5. Prendi in prestito un libro");
            System.out.println("6. Restituisci un libro");
            System.out.println("7. Libri in ritardo");
            System.out.println("8. Esci");
            System.out.print("Scegli un'opzione: ");
            String scelta = scanner.nextLine();

            switch (scelta) {
                case "1":
                    System.out.print("Inserisci nome utente: ");
                    String nome = scanner.nextLine();
                    currentUser = new User(nome);
                    System.out.println("Utente registrato: " + nome);
                    break;
                case "2":
                    System.out.print("Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Autore: ");
                    String autore = scanner.nextLine();
                    Book nuovo = new Book(titolo, autore);
                    library.addBook(nuovo);
                    break;
                case "3":
                    library.displayBooks();
                    break;
                case "4":
                    System.out.print("Inserisci parola chiave: ");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                    break;
                case "5":
                    if (currentUser == null) {
                        System.out.println("Registrati prima come utente.");
                        break;
                    }
                    System.out.print("Titolo del libro: ");
                    String titoloPrestito = scanner.nextLine();
                    Book libroPrestito = library.findBook(titoloPrestito);
                    if (libroPrestito != null) {
                        currentUser.borrowBook(libroPrestito);
                    } else {
                        System.out.println("Libro non trovato.");
                    }
                    break;
                case "6":
                    if (currentUser == null) {
                        System.out.println("Registrati prima come utente.");
                        break;
                    }
                    System.out.print("Titolo del libro da restituire: ");
                    String titoloRestituzione = scanner.nextLine();
                    Book libroRestituzione = library.findBook(titoloRestituzione);
                    if (libroRestituzione != null) {
                        currentUser.returnBook(libroRestituzione);
                    } else {
                        System.out.println("Libro non trovato.");
                    }
                    break;
                case "7":
                    if (currentUser == null) {
                        System.out.println("Registrati prima come utente.");
                        break;
                    }
                    currentUser.checkOverdueBooks();
                    break;
                case "8":
                    System.out.println("Chiusura programma.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}

