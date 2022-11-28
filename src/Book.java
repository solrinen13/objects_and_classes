import java.util.Objects;
class Book {
    public String bookName;
    public String author;
    public int yearOfPublishing;
    public Object Author;

    public void getInfoBook () {
        System.out.print("Книга " + bookName + " авторства " + Author + " имеет " + yearOfPublishing +" год выпуска.");
        System.out.println("");
    }
    public String getName () {
        return bookName;
    }
    public String getAuthor () {
        return author;
    }
    public int getYearOfPublishing () {
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    Book(String bookName, String author, int yearOfPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;






    }

}