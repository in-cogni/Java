public abstract class LibraryItem {
    String title;

    public LibraryItem(String title) {
        this.title = title;
    }
    abstract void printInfo();
}
