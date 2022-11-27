public class Author {
    public String firstNameAuthor;
    public String lastNameAuthor;

    public String getFirstName() {
        return firstNameAuthor;
    }
    public String getLastName() {
        return lastNameAuthor;
    }
    public String getAuthorFullName() {
        return firstNameAuthor + lastNameAuthor;
    }
    String authorFullName = firstNameAuthor + lastNameAuthor;
    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }
    public void getInfoAuthor () {
        System.out.print("Фамилия автора " + lastNameAuthor + " имя автора " + firstNameAuthor +" книги в наличие " + 1);
        System.out.println("");
    }

    Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }
}
