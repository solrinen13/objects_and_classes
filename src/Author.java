import java.util.Objects;
public class Author {
    public String firstNameAuthor;
    public String lastNameAuthor;



    Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }
    public String getFirstName() {
        return firstNameAuthor;
    }
    public String getLastName() {
        return lastNameAuthor;
    }
 /*   public String getAuthorFullName() {
        return firstNameAuthor + lastNameAuthor;
    }*/

    public void getInfoAuthor () {
        System.out.print("Фамилия автора " + lastNameAuthor + " имя автора " + firstNameAuthor +" книги в наличие " + 1);
        System.out.println("");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstNameAuthor.equals(author.firstNameAuthor) && lastNameAuthor.equals(author.lastNameAuthor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }
    @Override
    public String toString() {

          return firstNameAuthor + " " + lastNameAuthor;
    }

}
