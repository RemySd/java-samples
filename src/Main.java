public class Main {
    public static void main(String[] args){

        System.out.println("Library test implementation");

        Library library = new Library();

        Book book1 = new Book(1234, "The magic book", new String[] {"Rémy S"});
        Book book2 = new Book(1234, "The dev book", new String[] {"Rémy S"});

        library.add(book1);
        library.add(book2);

        Library librarySecondary = new Library();

        librarySecondary.add(book1);

        System.out.println(library.iterator().next().getTitle());
    }
}
