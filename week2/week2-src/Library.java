import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {

    public Library() {
        library = new ArrayList<Book>();
    }

    List<Book> library;

    /**
     *
     * @param book: The book to be added.
     * @throws IOException: Book param cannot be null .
     */
    void addBook(Book book)throws IllegalArgumentException {
        if(book == null){
            throw new IllegalArgumentException("device error");//checked exception
        }
        else{
            library.add(book);
        }
    }

    /**
     *
     * @param findBook: The book to be searched.
     * @return the list of searching book
     */
    List<Book> searchForBooks(String findBook){
        List<Book> searchResult = new ArrayList<>();
        for(Book book: library){
            if(book.getTitle().contains(findBook) || book.getAuthor().contains(findBook)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    /**
     *
     * @param book: name of the searching book.
     */
    void checkOutBook(Book book){
        if(book.isAvailable() == true){
            System.out.printf(book + "is available.");
        }
        if(book.isAvailable() == false){
            System.out.printf(book + "is not available.");
        }
    }

    /**
     *
     * @param book: name of the searching book.
     */
    void returnBookList(Book book){
        book.getTitle();
    }
}
