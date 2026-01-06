public class Book extends LibraryItem{
    String author;
    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    void printInfo(){
        System.out.println("Book "+title+", author "+author);
    }

    public String getAuthor() {
        return author;
    }
}
