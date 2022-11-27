public class Main {
    public static void main(String[] args) {
        Book deadSeaScrolls = new Book("Свитки мертвого моря","Человеки", -4000); // Используем созданный конструктор
        deadSeaScrolls.getInfoBook ();
        Book steppeWolf = new Book("Степной волк", "Германн Гессе", 1927); // Повторим
        steppeWolf.getInfoBook ();

        Author Hermann_Hesse = new Author("Герман","Гессе");
        Hermann_Hesse.getInfoAuthor();

        Author Cheloveki = new Author("Человеки","");
        Cheloveki.getInfoAuthor();



        deadSeaScrolls.setYearOfPublishing (2021);
        System.out.println("Год издания" +deadSeaScrolls);


    }
}