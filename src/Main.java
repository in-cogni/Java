import animals.Bird;

void main() {
    Bird bird = new Bird();
    /*bird.fly(5);
    bird.fly(5.0);
    bird.fly(5L);*/
    //bird.sleep();

    LibraryItem[] items = {
            new Book("ASsJ", "ASDf"),
            new Magazine("ASsJ", 1)
    };

    for(LibraryItem item: items){
        item.printInfo();
    }

LibraryItem item = new Book("cssa", "xaaxd");
    if(item instanceof Book){
        Book book = (Book) item;
        book.getAuthor();
    }

}
