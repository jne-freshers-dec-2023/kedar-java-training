import java.util.ArrayList;
import java.util.List;

 class BookHASA {

    private String title;
    private String author;

    public BookHASA(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library{

    private List<BookHASA> bookcollection;

    public Library() {
        this.bookcollection = new ArrayList<>();
    }

    public void addBook(BookHASA Book){
        bookcollection.add(Book);
    }

    public void displayInfo(){
        System.out.println("Books in Libaray");
        for(BookHASA book : bookcollection){
            System.out.println("Title :"+book.getTitle() + " Author :"+book.getAuthor());
        }
    }
}
public class HASA{
    public static void main(String[] args) {

        Library myLibrary = new Library();

        myLibrary.addBook(new BookHASA("BOOK 1","JK"));
        myLibrary.displayInfo();

    }
}



