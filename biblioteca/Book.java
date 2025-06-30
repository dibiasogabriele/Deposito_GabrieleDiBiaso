

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private LocalDate borrowDate; // per penalità


    // Costruttore uso nomi inglesi per mantenere coerenza con book
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.borrowDate = null;
    }


    // getter per ottenere titolo
    public String getTitle() {
        return title;
    }

    // getter per ottenere autore
    public String getAuthor() {
        return author;
    }


    // metodo condizione booleana per valutare se il titolo è disponibile

    public boolean isAvailable() {
        return isAvailable;
    }


    // Setter per impostare la disponibilità del libro
    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    // getter per ottenere la data del prestito
    public LocalDate getBorrowDate() {
        return borrowDate;
    }

// setter per impostare tale date
    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }




    // Metodo per stampare le informazioni del libro
    public void displayBookInfo() {
        System.out.println("Titolo: " + title);
        System.out.println("Autore: " + author);
        System.out.println("Disponibile: " + (isAvailable ? "Sì" : "No"));
        if (borrowDate != null) {
            System.out.println("Data prestito: " + borrowDate);
        }
        System.out.println("   ");
    }
}
