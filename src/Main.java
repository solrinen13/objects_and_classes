public class Main {
  private static Book[] booksArray = new Book[10];
    public static void main(String[] args) {

        Author author1 = new Author("Герман","Гессе");


        Author author2 = new Author("Человеки","");


        Book deadSeaScrolls = new Book("Свитки мертвого моря",author2, -4000); // Используем созданный конструктор
       deadSeaScrolls.getInfoBook ();
        Book steppeWolf = new Book("Степной волк",author1, 1927); // Повторим
        steppeWolf.getInfoBook ();
        author1.getInfoAuthor();


        deadSeaScrolls.setYearOfPublishing (2021);
        System.out.println("Год издания " +deadSeaScrolls.getYearOfPublishing());


    }
}