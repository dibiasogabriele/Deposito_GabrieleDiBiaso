import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Book> borrowedBooks;// arraylist di libri presi in prestito


    // costruttore
    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }


    //getter per ottenere nome
    public String getName() {
        return name;
    }

    // metodo per modificare arraylist per libri in prestito
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }


    //condizione per potere prendere libri in prestito
    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() >= 3) {// se il numero è superiore a 3 , non si puo piu prendere in prestito un libro
            System.out.println("Hai già preso in prestito il numero massimo di 3 libri.");
            return false;
        }


        // se il libro è disponibile,lo aggiungo ai prestiti e imposto con setter la disponibilità come falsa
        // imposto con localdate quando è stato effettuasto il prestito
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            book.setBorrowDate(LocalDate.now());
            System.out.println("Hai preso in prestito: " + book.getTitle());
            return true;
        } else {
            System.out.println("Il libro \"" + book.getTitle() + "\" non è disponibile.");// altrimenti non è disponibile
            return false;
        }
    }

    // metodo per restituire libro
    public boolean returnBook(Book book) {
        if (borrowedBooks.remove(book)) {//se lo rimuovo dalla lista dei prestiti, allora imposto con setter disponibilita true
            book.setAvailable(true);
            book.setBorrowDate(null);// imposto la data come sopra
            System.out.println("Hai restituito: " + book.getTitle());
            return true;
        } else {
            System.out.println("Non hai questo libro in prestito.");
            return false;
        }
    }

    // metodo per visualizzare lista libri in prestito
    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Nessun libro in prestito.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }


    //metodo per controllare se ci sono libri in ritardo
    public void checkOverdueBooks() {
        LocalDate today = LocalDate.now();
        for (Book book : borrowedBooks) {
            LocalDate dueDate = book.getBorrowDate().plusDays(14);// Calcola la scadenza (14 giorni dopo il prestito)
            if (today.isAfter(dueDate)) {
                System.out.println("Libro in ritardo: " + book.getTitle() + " (Scadenza: " + dueDate + ")");
            }
        }
    }
}







