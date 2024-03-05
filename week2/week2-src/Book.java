/**
 * @author Alper Han Uyanik
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    /**
     *
     * @return the value of title.
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title: The title of the book.
     * @param author: The author of the book.
     * @param ISBN:  The International Standard Book Number of the book.
     * @param isAvailable:  Indicates whether the book is currently available in the library.
     */
    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    /**
     *
     * @param title: The title of the book.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return author: Returns the author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author: The author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return ISBN: Returns the International Standard Book Number of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     *
     * @param ISBN: The International Standard Book Number of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     *
     * @return isAvailable: Check the book is currently available in the library.
     */

    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     *
     * @param available: Returns the book is currently available in the library, true or false.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
