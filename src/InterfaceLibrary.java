public interface InterfaceLibrary<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean constains(E book);
    boolean add(E book);
    E remove();

    boolean addAll(InterfaceLibrary<E> library);
    boolean removeAll(InterfaceLibrary<E> library);
    void clear();
}
