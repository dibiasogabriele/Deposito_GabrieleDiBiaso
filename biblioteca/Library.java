




import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;// uso arraylist perche essendo dinamico posso aggiungere titoli



    // Costruttore
    public Library() {
        books = new ArrayList<>();
    }

    // Aggiungi libro alla lista
    public void addBook(Book book) {
        books.add(book);// metodo add per aggiugnere libro all'arraylist
        System.out.println("Libro aggiunto: " + book.getTitle());
    }

    // Mostra tutti i libri
    public void displayBooks() {
        if (books.isEmpty()) {// se arraylist è vuoto
            System.out.println("Nessun libro in biblioteca.");
        } else {
            for (Book book : books) {// altrimenti mostro i libri disponibili
                book.displayBookInfo();
            }
        }
    }

    // metodo per  trovare un singolo libro, dato il titolo completo, e lo restituisce come oggetto Book.
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }


    // Ricerca libri per parole chiave
    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                book.displayBookInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nessun libro trovato con la parola chiave: " + keyword);
        }
    }
}

