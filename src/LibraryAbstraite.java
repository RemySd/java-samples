import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LibraryAbstraite implements InterfaceLibrary<Book> {

    private List<Book> books;

    // Constructor
    public LibraryAbstraite() {
        books = new ArrayList<>();
    }

    // Methods
    public boolean add(Book book) {
        return books.add(book);
    }

    public Book remove() {
        return books.remove(0);
    }

    public int size() {
        return books.size();
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public boolean constains(Book book) {
        for(Iterator<Book> it = books.iterator(); it.hasNext();)
        {
            if (it.equals(book)) {
                return true;
            }

            it.next();
        }

        return false;
    }

    public boolean addAll(InterfaceLibrary<Book> library) {
        Iterator<Book> it = library.iterator();
        boolean modified = false;
        while(it.hasNext())
            if(add(it.next())) modified = true;
        return modified;
    }

    public boolean removeAll(InterfaceLibrary<Book> library) {
        Iterator<Book> it = library.iterator();
        boolean modified = false;
        Book bookToRemove = null;
        while(it.hasNext())
            bookToRemove = it.next();
            if(library.constains(bookToRemove)) {
                remove();
                modified = true;
            }
        return modified;
    }

    public void clear() {
        books.clear();
    }

    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
