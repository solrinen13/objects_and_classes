import java.util.Objects;
public class Book {
    private  String bookName;
    private Author authorFullName;
    private int yearOfPublishing;

    public Book(String bookName, Author authorFullName, int yearOfPublishing) {
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.yearOfPublishing = yearOfPublishing;


    }
    public void getInfoBook () {
        System.out.print("Книга " + bookName + " авторства " + authorFullName + " имеет " + yearOfPublishing +" год выпуска.");
        System.out.println("");
    }
    public String getName () {
        return bookName;
    }
    public String getAuthor () {
        return authorFullName.getFirstName() + " " + authorFullName.getLastName();
    }
    public int getYearOfPublishing () {

        return yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && authorFullName.equals(book.authorFullName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorFullName);
    }

    @Override
    public String toString() {
        return "Книга " + bookName + " авторства " + authorFullName + " имеет " + yearOfPublishing +" год выпуска.";
    }
}