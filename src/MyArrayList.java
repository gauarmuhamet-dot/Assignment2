import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[10];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T item) {
        if (size == elements.length) {
            increaseBuffer();
        }
        elements[size++] = item;
    }

    private void increaseBuffer() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    public void set(int index, T item) {
        elements[index] = item;
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[10];
    }

    @Override
    public Object[] toArray() {
        Object[] copy = new Object[size];
        for (int i = 0; i < size; i++) {
            copy[i] = elements[i];
        }
        return copy;
    }

    @Override public void add(int index, T item) {}
    @Override public void addFirst(T item) {}
    @Override public void addLast(T item) {}
    @Override public T getFirst() { return null; }
    @Override public T getLast() { return null; }
    @Override public void remove(int index) {}
    @Override public void removeFirst() {}
    @Override public void removeLast() {}
    @Override public void sort() {}
    @Override public int indexOf(Object object) { return -1; }
    @Override public int lastIndexOf(Object object) { return -1; }
    @Override public boolean exists(Object object) { return false; }
    @Override public Iterator<T> iterator() { return null; }
}